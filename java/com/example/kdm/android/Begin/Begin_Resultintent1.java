package com.example.kdm.android.Begin;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Resultintent1 extends AppCompatActivity {

    TextView tv_title, tv_code,resultintent_tv1;
    Button resultintent_btn1;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__resultintent1);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        resultintent_btn1 = findViewById(R.id.resultintent_btn1);
        resultintent_tv1 = findViewById(R.id.resultintent_tv1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        resultintent_btn1.setVisibility(View.GONE);
                        resultintent_tv1.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        resultintent_tv1.setVisibility(View.GONE);
                        resultintent_btn1.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        resultintent_tv1.setVisibility(View.VISIBLE);
                        resultintent_btn1.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });
    }

    public void onClick(View view){
        Intent intent = new Intent(Begin_Resultintent1.this,Begin_Resultintent2.class);
        startActivityForResult(intent, 5);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode == 5){

            if (resultCode == Activity.RESULT_OK){
                resultintent_tv1.setText("Hello " + data.getStringExtra("result"));
            }
            if (resultCode == Activity.RESULT_CANCELED){

            }
        }
    }
}
