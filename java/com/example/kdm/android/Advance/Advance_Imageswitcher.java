package com.example.kdm.android.Advance;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.kdm.android.R;

public class Advance_Imageswitcher extends AppCompatActivity implements View.OnClickListener {

    TextView tv_title, tv_code, tv_heading;
    ImageSwitcher imageSwitcher;
    Button btnPrevious, btnNext;
    BottomNavigationView bottomNavigationView;

    int[] LOGO = {
            R.drawable.france,
            R.drawable.usa,
            R.drawable.germany,
            R.drawable.sa,
            R.drawable.india,
    };
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__imageswitcher);

        tv_title = findViewById(R.id.begin_et_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        tv_heading = findViewById(R.id.imageSwitcher_heading);
        imageSwitcher = findViewById(R.id.imageSwitcher);
        btnNext = findViewById(R.id.ImageSwitcher_btnNext);
        btnPrevious = findViewById(R.id.ImageSwitcher_btnPrevious);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        btnNext.setVisibility(View.GONE);
                        btnPrevious.setVisibility(View.GONE);
                        tv_heading.setVisibility(View.GONE);
                        imageSwitcher.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        btnNext.setVisibility(View.GONE);
                        btnPrevious.setVisibility(View.GONE);
                        tv_heading.setVisibility(View.GONE);
                        imageSwitcher.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        btnNext.setVisibility(View.VISIBLE);
                        btnPrevious.setVisibility(View.VISIBLE);
                        imageSwitcher.setVisibility(View.VISIBLE);
                        tv_heading.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView image = new ImageView(getApplicationContext());
                image.setScaleType(ImageView.ScaleType.FIT_CENTER);
                image.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return image;
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ImageSwitcher_btnNext:
                if (currentIndex<LOGO.length-1){
                    currentIndex = currentIndex+1;
                    imageSwitcher.setBackgroundResource(LOGO[currentIndex]);
                }
                break;

            case R.id.ImageSwitcher_btnPrevious:
                if (currentIndex>0){
                    currentIndex = currentIndex-1;
                    imageSwitcher.setBackgroundResource(LOGO[currentIndex]);
                }
                break;
        }
    }
}
