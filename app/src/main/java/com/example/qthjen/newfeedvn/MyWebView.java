package com.example.qthjen.newfeedvn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebView extends AppCompatActivity {

    private WebView wbV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        wbV = (WebView) findViewById(R.id.wv);

        Intent intent = getIntent();
        String link = intent.getStringExtra("link");

        wbV.loadUrl(link);
        wbV.setWebViewClient(new WebViewClient());

    }
}
