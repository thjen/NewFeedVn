package com.example.qthjen.newfeedvn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url1);
                startActivity(intent);
            }
        });

        btTheGioi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url2);
                startActivity(intent);
            }
        });

        btKinhDoanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url3);
                startActivity(intent);
            }
        });

        btStartup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url4);
                startActivity(intent);
            }
        });

        btGiaiTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url5);
                startActivity(intent);
            }
        });

        btTheThao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url6);
                startActivity(intent);
            }
        });

        btPhapLuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url7);
                startActivity(intent);
            }
        });

        btGiaoDuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url8);
                startActivity(intent);
            }
        });

        btSucKhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url9);
                startActivity(intent);
            }
        });

        btGiaDinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url10);
                startActivity(intent);
            }
        });

        btDuLich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url11);
                startActivity(intent);
            }
        });

        btKhoaHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url12);
                startActivity(intent);
            }
        });

        btSoHoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url13);
                startActivity(intent);
            }
        });

        btXe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url14);
                startActivity(intent);
            }
        });

        btTamSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url15);
                startActivity(intent);
            }
        });

        btCuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainAttributes.class);
                intent.putExtra("url", url16);
                startActivity(intent);
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

}
