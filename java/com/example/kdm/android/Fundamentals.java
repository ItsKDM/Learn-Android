package com.example.kdm.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Fundamentals extends AppCompatActivity {

    TextView tv_app_fundamental, tv_activity, tv_activity_content, tv_lifecycle, tv_lifecycle_content, tv_br, tv_br_content, tv_cp, tv_cp_content, tv_service, tv_service_content;
    ImageView iv_lifecycle, iv_create, iv_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundamentals);

        tv_app_fundamental = findViewById(R.id.tv_app_fundamental);
        tv_activity = findViewById(R.id.tv_activity);
        tv_activity_content = findViewById(R.id.tv_activity_content);
        tv_lifecycle = findViewById(R.id.tv_lifecycle);
        tv_lifecycle_content = findViewById(R.id.tv_lifecycle_content);
        tv_br = findViewById(R.id.tv_br);
        tv_br_content = findViewById(R.id.tv_br_content);
        tv_cp = findViewById(R.id.tv_cp);
        tv_cp_content = findViewById(R.id.tv_cp_content);
        tv_service = findViewById(R.id.tv_service);
        tv_service_content = findViewById(R.id.tv_service_content);
        iv_lifecycle = findViewById(R.id.iv_lifecycle);
        iv_create = findViewById(R.id.iv_create);
        iv_service = findViewById(R.id.iv_service);
    }
}
