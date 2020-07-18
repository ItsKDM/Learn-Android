package com.example.kdm.android.Begin;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Radio extends AppCompatActivity {

    TextView tv_title, tv_code;
    RadioGroup radioGroup;
    BottomNavigationView bottomNavigationView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__radio);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        radioGroup = findViewById(R.id.radioGroup);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        relativeLayout = findViewById(R.id.relativeLayout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        tv_code.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        radioGroup.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_code.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        radioGroup.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        radioGroup.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radiobtn1:
                        relativeLayout.setBackgroundColor(Color.RED);
                        break;

                    case R.id.radiobtn2:
                        relativeLayout.setBackgroundColor(Color.BLUE);
                        break;

                    case R.id.radiobtn3:
                        relativeLayout.setBackgroundColor(Color.GREEN);
                        break;
                }
            }
        });

    }
}
