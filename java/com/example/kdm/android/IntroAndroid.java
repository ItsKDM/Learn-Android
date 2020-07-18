package com.example.kdm.android;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroAndroid extends AppCompatActivity {

    TextView tv_android_intro, tv_content_android_intro, tv_history, tv_content_history, tv_version;
    ImageView iv_version;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10, btn_11, btn_12, btn_13, btn_14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_android);

        tv_android_intro = findViewById(R.id.tv_android_intro);
        tv_content_android_intro = findViewById(R.id.tv_content_android_intro);
        tv_history = findViewById(R.id.tv_history);
        tv_content_history = findViewById(R.id.tv_content_history);
        tv_version = findViewById(R.id.tv_version);
        iv_version = findViewById(R.id.iv_version);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_10 = findViewById(R.id.btn_10);
        btn_11 = findViewById(R.id.btn_11);
        btn_12 = findViewById(R.id.btn_12);
        btn_13 = findViewById(R.id.btn_13);
        btn_14 = findViewById(R.id.btn_14);
    }
}
