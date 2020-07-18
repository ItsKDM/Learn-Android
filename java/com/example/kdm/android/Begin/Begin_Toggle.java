package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.example.kdm.android.R;

public class Begin_Toggle extends AppCompatActivity {

    TextView tv_title, tv_code, tv_toggle;
    ToggleButton toggleButton;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__toggle);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        tv_toggle = findViewById(R.id.tv_toggle);
        toggleButton = findViewById(R.id.toggleButton);;
        bottomNavigationView = findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        toggleButton.setVisibility(View.GONE);
                        tv_toggle.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        toggleButton.setVisibility(View.GONE);
                        tv_toggle.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        toggleButton.setVisibility(View.VISIBLE);
                        tv_toggle.setVisibility(View.VISIBLE);
                        break;

                }
                return true;
            }
        });
    }

    public void onToggleClick(View view){
        if (toggleButton.isChecked()){
            tv_toggle.setText("Toggle is ON!");
        }else{
            tv_toggle.setText("Toggle is OFF!");
        }
    }
}
