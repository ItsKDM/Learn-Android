package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Spinner extends AppCompatActivity {

    TextView tv_code, tv_title, tv1, tv2, tv_nation;
    Spinner spinner;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__spinner);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        tv1 = findViewById(R.id.spinner_tv1);
        tv2 = findViewById(R.id.spinner_tv2);
        tv_nation = findViewById(R.id.national);
        spinner = findViewById(R.id.spinner);
        bottomNavigationView = findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        tv1.setVisibility(View.GONE);
                        tv2.setVisibility(View.GONE);
                        tv_nation.setVisibility(View.GONE);
                        spinner.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        tv1.setVisibility(View.GONE);
                        tv2.setVisibility(View.GONE);
                        tv_nation.setVisibility(View.GONE);
                        spinner.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        tv1.setVisibility(View.VISIBLE);
                        tv2.setVisibility(View.VISIBLE);
                        tv_nation.setVisibility(View.VISIBLE);
                        spinner.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });

        String[] sports = {"Cricket", "Football", "Hockey", "Bull Fight", "Kabaddi"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sports);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        tv_nation.setText("Australia");
                        break;

                    case 1:
                        tv_nation.setText("Brazil");
                        break;

                    case 2:
                        tv_nation.setText("India");
                        break;

                    case 3:
                        tv_nation.setText("Spain");
                        break;

                    case 4:
                        tv_nation.setText("Bangladesh");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }
}
