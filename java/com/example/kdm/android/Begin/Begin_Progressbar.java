package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Progressbar extends AppCompatActivity {

    TextView tv_title, tv_code;
    ProgressBar progressBar, progressBarHorizontal;
    Button btn_circle, btn_horizontal;
    BottomNavigationView bottomNavigationView;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__progressbar);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        progressBar = findViewById(R.id.progressBar);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        btn_circle = findViewById(R.id.btn_progress1);
        btn_horizontal = findViewById(R.id.btn_progress2);
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
                        progressBar.setVisibility(View.GONE);
                        progressBarHorizontal.setVisibility(View.GONE);
                        btn_circle.setVisibility(View.GONE);
                        btn_horizontal.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.GONE);
                        progressBarHorizontal.setVisibility(View.GONE);
                        btn_circle.setVisibility(View.GONE);
                        btn_horizontal.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        progressBar.setVisibility(View.VISIBLE);
                        progressBarHorizontal.setVisibility(View.VISIBLE);
                        btn_circle.setVisibility(View.VISIBLE);
                        btn_horizontal.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });
    }

    public void progressBarClick(View v){
        progressBar.setVisibility(View.VISIBLE);
    }

    public void progressBarHorizontalClick(View v){
        setProgressValue(progress);
        progressBarHorizontal.setVisibility(View.VISIBLE);
    }

    private void setProgressValue(final int progress){
        progressBarHorizontal.setProgress(progress);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                setProgressValue(progress + 10);
            }
        });
        thread.start();
    }
}
