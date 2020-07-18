package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Ratingbar extends AppCompatActivity {

    TextView tv_title, tv_code, tv_rating, tv_rating1;
    Button btn_submit;
    RatingBar ratingBar;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__ratingbar);

        tv_code = findViewById(R.id.begin_textView);
        tv_title = findViewById(R.id.begin_tv_title);
        tv_rating = findViewById(R.id.textView_rating);
        tv_rating1 = findViewById(R.id.textView_rating1);
        btn_submit = findViewById(R.id.submitButton_rating);
        ratingBar = findViewById(R.id.ratingBar);
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
                        ratingBar.setVisibility(View.GONE);
                        tv_rating.setVisibility(View.GONE);
                        tv_rating1.setVisibility(View.GONE);
                        btn_submit.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        ratingBar.setVisibility(View.GONE);
                        tv_rating.setVisibility(View.GONE);
                        tv_rating1.setVisibility(View.GONE);
                        btn_submit.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        ratingBar.setVisibility(View.VISIBLE);
                        tv_rating.setVisibility(View.VISIBLE);
                        tv_rating1.setVisibility(View.VISIBLE);
                        btn_submit.setVisibility(View.VISIBLE);
                        break;

                }
                return true;
            }
        });

    }

    public void onSubmit(View view){
        float ratingValue = ratingBar.getRating();

        if (ratingValue < 2){
            tv_rating.setText("Rating: " + ratingValue + "\nIs it that worse?");
        }else if (ratingValue <= 3 && ratingValue >= 2){
            tv_rating.setText("Rating: " + ratingValue + "\nWe will try to be better!");
        }else if (ratingValue > 3 && ratingValue <=4){
            tv_rating.setText("Rating: " + ratingValue + "\nThat means you are having a good time here. :)");
        }else if (ratingValue > 4){
            tv_rating.setText("Rating: " + ratingValue + "\nWow! We will keep up the work ;)");
        }
    }
}
