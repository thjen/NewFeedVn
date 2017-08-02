package com.example.qthjen.newfeedvn;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainAttributes extends AppCompatActivity {

    ListView              lv;
    ArrayList<Attributes> arrayList;
    CustomAdapter         customAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        lv = (ListView) findViewById(R.id.lv);
        arrayList = new ArrayList<Attributes>();

        final Intent intent = getIntent();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadData().execute(intent.getStringExtra("url"));
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent1 = new Intent(MainAttributes.this, MyWebView.class);
                intent1.putExtra("link", arrayList.get(i).mLink);
                startActivity(intent1);

            }
        });

    }

    /** đọc liên kết **/
    private class ReadData extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {

            StringBuilder stringBuilder = new StringBuilder();

            try {

                URL url  = new URL(strings[0]);
                InputStreamReader inputStreamReader = new InputStreamReader(url.openConnection().getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line = "";
                while( (line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line + "\n");
                }
                bufferedReader.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return stringBuilder.toString();
        }

        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

        try {

            XMLDOMParser parse = new XMLDOMParser();
            Document document = parse.getDocument(s);
            NodeList nodeList = document.getElementsByTagName("item");
            NodeList nodeListDescription = document.getElementsByTagName("description");

            String title = "";
            String link  = "";
            String image = "";

            for (int i = 0; i < nodeList.getLength(); i++) {

                Element element = (Element) nodeList.item(i);

                String cData = nodeListDescription.item(i + 1).getTextContent();
                Pattern pattern = Pattern.compile("<img[^>]+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>");
                Matcher matcher = pattern.matcher(cData);
                if (matcher.find()) {
                    image = matcher.group(1);
                }

                title = parse.getValue(element, "title");
                link  = parse.getValue(element, "link");

                arrayList.add(new Attributes(image, title, link));
                customAdapter = new CustomAdapter(MainAttributes.this, R.layout.list_viewcustom, arrayList);
                lv.setAdapter(customAdapter);

            }
            customAdapter.notifyDataSetChanged();

        } catch ( Exception e) {
            Toast.makeText(MainAttributes.this, "Lỗi: Yêu cầu bạn bật INTERNET", Toast.LENGTH_SHORT).show();
        }
        }
    }

}
