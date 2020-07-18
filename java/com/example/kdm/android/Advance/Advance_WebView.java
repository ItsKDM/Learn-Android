package com.example.kdm.android.Advance;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Advance_WebView extends AppCompatActivity {

    TextView tv_title, tv_code;
    BottomNavigationView bottomNavigationView;
    Button wv_btn;
    EditText wv_et;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__web_view);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        wv_btn = findViewById(R.id.wv_btn);
        wv_et = findViewById(R.id.wv_et);
        webView = findViewById(R.id.webView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        webView.loadUrl("https://www.google.com");
        webView.setWebViewClient(new WebViewClient());
        final WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = wv_et.getText().toString();
                webView.loadUrl("https://" + url);
            }
        });
    }
}