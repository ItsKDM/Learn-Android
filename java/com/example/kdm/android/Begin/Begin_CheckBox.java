package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_CheckBox extends AppCompatActivity {

    TextView tv_title, tv_code, textView, textView1;
    Button submit_btn;
    CheckBox checkbox1, checkbox2, checkbox3;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__check_box);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        submit_btn = findViewById(R.id.submitButton);
        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        bottomNavigationView = findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        checkbox1.setVisibility(View.GONE);
                        checkbox2.setVisibility(View.GONE);
                        checkbox3.setVisibility(View.GONE);
                        submit_btn.setVisibility(View.GONE);
                        textView.setVisibility(View.GONE);
                        textView1.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        checkbox1.setVisibility(View.GONE);
                        checkbox2.setVisibility(View.GONE);
                        checkbox3.setVisibility(View.GONE);
                        submit_btn.setVisibility(View.GONE);
                        textView.setVisibility(View.GONE);
                        textView1.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_code.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        checkbox1.setVisibility(View.VISIBLE);
                        checkbox2.setVisibility(View.VISIBLE);
                        checkbox3.setVisibility(View.VISIBLE);
                        submit_btn.setVisibility(View.VISIBLE);
                        textView.setVisibility(View.VISIBLE);
                        textView1.setVisibility(View.VISIBLE);
                        break;

                }
                return true;
            }
        });
    }

    public void onClick(View view){

        if (checkbox1.isChecked() == true && checkbox2.isChecked() == true && checkbox3.isChecked() == true){
            textView.setText("You Like all Sports!");
        }

        else if (checkbox1.isChecked() == true && checkbox2.isChecked() == true) {
            textView.setText("You Like Cricket and Football!");
        }

        else if (checkbox1.isChecked() == true && checkbox3.isChecked() == true) {
            textView.setText("You Like Cricket and Hockey!");
        }

        else if (checkbox2.isChecked() == true && checkbox3.isChecked() == true) {
            textView.setText("You Like Football and Hockey!");
        }

        else if (checkbox1.isChecked() == true) {
            textView.setText("You Like Cricket!");
        }

        else if (checkbox2.isChecked() == true) {
            textView.setText("You Like Football!");
        }

        else if (checkbox3.isChecked() == true) {
            textView.setText("You Like Hockey!");
        }

        else{
            textView.setText("You don't like these Sports!");
        }
    }
}

