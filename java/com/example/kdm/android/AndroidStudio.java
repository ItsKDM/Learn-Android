package com.example.kdm.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AndroidStudio extends AppCompatActivity {

    TextView tv_introduction_android, tv_content_introduction, tv_how_to, tv_req, tv_win_os, tv_step_2, tv_follow, tv_and_ui, tv_ui_content;
    ImageView iv_logo, iv_jdk, iv_install, iv_ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_studio);

        tv_introduction_android = findViewById(R.id.tv_introduction_android);
        tv_content_introduction = findViewById(R.id.tv_content_introduction);
        tv_how_to = findViewById(R.id.tv_how_to);
        tv_req = findViewById(R.id.tv_req);
        tv_win_os = findViewById(R.id.tv_win_os);
        tv_step_2 = findViewById(R.id.tv_step_2);
        tv_follow = findViewById(R.id.tv_follow);
        tv_and_ui = findViewById(R.id.tv_and_ui);
        tv_ui_content = findViewById(R.id.tv_ui_content);
        iv_logo = findViewById(R.id.iv_logo);
        iv_jdk = findViewById(R.id.iv_jdk);
        iv_install = findViewById(R.id.iv_install);
        iv_ui = findViewById(R.id.iv_ui);
    }
}
