package com.example.kdm.android.Advance;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Advance_Bottom_Navi extends AppCompatActivity {

    TextView textView, tv_title, tv_bottom_navi;
    BottomNavigationView bottomNavigationView, navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__bottom__navi);

        bottomNavigationView = findViewById(R.id.begin_navigation);
        navigation = findViewById(R.id.navigation);
        tv_bottom_navi = findViewById(R.id.textView_bottom_navi);
        tv_title = (TextView) findViewById(R.id.begin_tv_title);
        textView = findViewById(R.id.begin_textView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        textView.setText("");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        textView.setText("");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        textView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.bottom_home:
                        tv_bottom_navi.setText("Home Activity");
                        break;

                    case R.id.camera:
                        tv_bottom_navi.setText("Camera Activity");
                        break;

                    case R.id.profile:
                        tv_bottom_navi.setText("Profile Activity");
                        break;
                }
                return true;
            }
        });
    }
}