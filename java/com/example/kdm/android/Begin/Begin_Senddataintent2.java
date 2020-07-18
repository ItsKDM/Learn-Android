package com.example.kdm.android.Begin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Senddataintent2 extends AppCompatActivity {

    TextView tv_title, tv_code, senddata_tv1;
    Button senddata_btn2;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__senddataintent2);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        senddata_btn2 = findViewById(R.id.senddata_btn2);
        senddata_tv1 = findViewById(R.id.senddata_tv1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        senddata_btn2.setVisibility(View.GONE);
                        senddata_tv1.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        senddata_btn2.setVisibility(View.GONE);
                        senddata_tv1.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        senddata_btn2.setVisibility(View.VISIBLE);
                        senddata_tv1.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        String name = getIntent().getStringExtra("name");
        senddata_tv1.setText("Your name is " + name);
    }

    public void onClick(View view) {
        android.content.Intent intnt = new Intent(Begin_Senddataintent2.this, Begin_Senddataintent1.class);
        startActivity(intnt);
    }
}