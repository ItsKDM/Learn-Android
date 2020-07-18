package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Seekbar extends AppCompatActivity {

    TextView tv_title, tv_code, tv_seekbar;
    SeekBar seekBar;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__seekbar);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        tv_seekbar = findViewById(R.id.textView_SeekBar);
        seekBar = findViewById(R.id.seekBar);
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
                        seekBar.setVisibility(View.GONE);
                        tv_seekbar.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        seekBar.setVisibility(View.GONE);
                        tv_seekbar.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        seekBar.setVisibility(View.VISIBLE);
                        tv_seekbar.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });

        tv_seekbar.setText("Programming is LOVE");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_seekbar.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
