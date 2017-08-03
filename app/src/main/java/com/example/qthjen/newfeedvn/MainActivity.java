package com.example.qthjen.newfeedvn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btThoiSu;
    private Button btTheGioi;
    private Button btKinhDoanh;
    private Button btStartup;
    private Button btGiaiTri;
    private Button btTheThao;
    private Button btPhapLuat;
    private Button btGiaoDuc;
    private Button btSucKhoe;
    private Button btGiaDinh;
    private Button btDuLich;
    private Button btKhoaHoc;
    private Button btSoHoa;
    private Button btXe;
    private Button btTamSu;
    private Button btCuoi;

    String url1  = "http://vnexpress.net/rss/thoi-su.rss";
    String url2  = "http://vnexpress.net/rss/the-gioi.rss";
    String url3  = "http://vnexpress.net/rss/kinh-doanh.rss";
    String url4  = "http://vnexpress.net/rss/startup.rss";
    String url5  = "http://vnexpress.net/rss/giai-tri.rss";
    String url6  = "http://vnexpress.net/rss/the-thao.rss";
    String url7  = "http://vnexpress.net/rss/phap-luat.rss";
    String url8  = "http://vnexpress.net/rss/giao-duc.rss";
    String url9  = "http://vnexpress.net/rss/suc-khoe.rss";
    String url10 = "http://vnexpress.net/rss/gia-dinh.rss";
    String url11 = "http://vnexpress.net/rss/du-lich.rss";
    String url12 = "http://vnexpress.net/rss/khoa-hoc.rss";
    String url13 = "http://vnexpress.net/rss/so-hoa.rss";
    String url14 = "http://vnexpress.net/rss/oto-xe-may.rss";
    String url15 = "http://vnexpress.net/rss/tam-su.rss";
    String url16 = "http://vnexpress.net/rss/cuoi.rss";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        onClickButton();

    }

    private void onClickButton() {

        btThoiSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url1,getResources().getString(R.string.lbthoiSu) );
            }
        });

        btTheGioi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url2,getResources().getString(R.string.lbtheGioi) );
            }
        });

        btKinhDoanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url3,getResources().getString(R.string.lbkinhDoanh) );
            }
        });

        btStartup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url4,getResources().getString(R.string.lbstartup) );
            }
        });

        btGiaiTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url5,getResources().getString(R.string.lbgiaiTri) );
            }
        });

        btTheThao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url6,getResources().getString(R.string.lbtheThao) );
            }
        });

        btPhapLuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url7,getResources().getString(R.string.lbphapLuat) );
            }
        });

        btGiaoDuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url8,getResources().getString(R.string.lbgiaoDuc) );
            }
        });

        btSucKhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url9,getResources().getString(R.string.lbsucKhoe) );
            }
        });

        btGiaDinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url10,getResources().getString(R.string.lbgiaDinh) );
            }
        });

        btDuLich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url11,getResources().getString(R.string.lbduLich) );
            }
        });

        btKhoaHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url12,getResources().getString(R.string.lbkhoaHoc) );
            }
        });

        btSoHoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url13,getResources().getString(R.string.lbsoHoa) );
            }
        });

        btXe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url14,getResources().getString(R.string.lbxe) );
            }
        });

        btTamSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url15,getResources().getString(R.string.lbtamSu) );
            }
        });

        btCuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ButtonCenter(url16,getResources().getString(R.string.lbcuoi) );
            }
        });

    }

    private void findView() {

        btThoiSu    = (Button) findViewById(R.id.btThoiSu);
        btTheGioi   = (Button) findViewById(R.id.btTheGioi);
        btKinhDoanh = (Button) findViewById(R.id.btKinhDoanh);
        btStartup   = (Button) findViewById(R.id.btStartup);
        btGiaiTri   = (Button) findViewById(R.id.btGiaiTri);
        btTheThao   = (Button) findViewById(R.id.btTheThao);
        btPhapLuat  = (Button) findViewById(R.id.btPhapLuat);
        btGiaoDuc   = (Button) findViewById(R.id.btGiaoDuc);
        btSucKhoe   = (Button) findViewById(R.id.btSucKhoe);
        btGiaDinh   = (Button) findViewById(R.id.btGiaDinh);
        btDuLich    = (Button) findViewById(R.id.btDuLich);
        btKhoaHoc   = (Button) findViewById(R.id.btKhoaHoc);
        btSoHoa     = (Button) findViewById(R.id.btSoHoa);
        btXe        = (Button) findViewById(R.id.btXe);
        btTamSu     = (Button) findViewById(R.id.btTamSu);
        btCuoi      = (Button) findViewById(R.id.btCuoi);

    }

    private void ButtonCenter(String url, String title) {

        Intent intent = new Intent(MainActivity.this, MainAttributes.class);
        intent.putExtra("url", url);
        intent.putExtra("title",title);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_start, R.anim.anim_end);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch ( item.getItemId() ) {

            case R.id.mnAbout:startActivity(new Intent(MainActivity.this, About.class));
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
