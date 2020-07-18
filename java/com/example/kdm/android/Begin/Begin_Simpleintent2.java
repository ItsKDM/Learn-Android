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

public class Begin_Simpleintent2 extends AppCompatActivity {

    TextView tv_title, tv_code;
    Button simple_intent_2;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__simpleintent2);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        simple_intent_2 = findViewById(R.id.simple_intent_2);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        simple_intent_2.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        simple_intent_2.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        simple_intent_2.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });
    }

    public void onClick(View view){
        Intent intent = new Intent(Begin_Simpleintent2.this, Begin_Simpleintent1.class);
        startActivity(intent);
    }
}
