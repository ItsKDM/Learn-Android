package com.example.kdm.android.Begin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Senddataintent1 extends AppCompatActivity {

    TextView tv_title, tv_code;
    EditText senddata_et1;
    Button senddata_btn1;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__senddataintent1);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        senddata_btn1 = findViewById(R.id.senddata_btn1);
        senddata_et1 = findViewById(R.id.senddata_et1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        senddata_btn1.setVisibility(View.GONE);
                        senddata_et1.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        senddata_btn1.setVisibility(View.GONE);
                        senddata_et1.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        senddata_btn1.setVisibility(View.VISIBLE);
                        senddata_et1.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });
    }

    public void onClick(View view) {

        String name = senddata_et1.getText().toString();
        if (name.length() == 0) {
            senddata_et1.setError("Enter Your Name!!");
        } else {
            android.content.Intent intnt = new Intent(Begin_Senddataintent1.this, Begin_Senddataintent2.class);
            intnt.putExtra("name", name);
            startActivity(intnt);
        }
    }
}