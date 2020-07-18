package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Switch extends AppCompatActivity {

    TextView tv_title, tv_code, tv_switch;
    Switch switchButton;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__switch);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        tv_switch = findViewById(R.id.tv_switch);
        switchButton = findViewById(R.id.switchButton);
        bottomNavigationView = findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        switchButton.setVisibility(View.GONE);
                        tv_switch.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        switchButton.setVisibility(View.GONE);
                        tv_switch.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_switch.setVisibility(View.VISIBLE);
                        switchButton.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });
    }

    public void onSwitchClick(View view){
        if(switchButton.isChecked()){
            tv_switch.setText("Switch is ON!");
        }else{
            tv_switch.setText("Switch is OFF!");
        }
    }

}
