package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.kdm.android.R;

import java.util.Calendar;

public class Begin_Date extends AppCompatActivity {

    TextView tv_title, tv_code, tv_date;
    DatePicker datePicker;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__date);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        tv_date = findViewById(R.id.tv_date);
        datePicker = findViewById(R.id.datePicker);
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
                        datePicker.setVisibility(View.GONE);
                        tv_date.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        datePicker.setVisibility(View.GONE);
                        tv_date.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        datePicker.setVisibility(View.VISIBLE);
                        tv_date.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });

        Calendar calendar = Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                tv_date.setText(dayOfMonth + " - " + monthOfYear + " - " + year);
            }
        });
    }
}
