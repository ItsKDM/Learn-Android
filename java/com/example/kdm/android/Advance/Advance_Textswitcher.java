package com.example.kdm.android.Advance;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.kdm.android.R;

public class Advance_Textswitcher extends AppCompatActivity implements View.OnClickListener {

    TextView tv_title, tv_code, tv_heading;
    TextSwitcher textSwitcher;
    Button btnPrevious, btnNext;
    BottomNavigationView bottomNavigationView;

    String[] Sayings = {
            "I measure myself, Am I better today then I was yesterday!",
            "Be like the flower that gives its fragrance even to the hand that crushes it!",
            "Forgiveness is the best revenge!",
            "There are two wasy to live a pleasant life, either in someone's heart or in someone's prayer.!",
            "Evil doers never think well of anyone because they see others in their own nature.!",
            "Anger is like a ball of fire, but if you swallow it, it's sweeter than honey.!",
            "It is easier to turn a mountain into dust than to create love in a heart that filled with haters.!"
    };
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__textswitcher);

        tv_title = findViewById(R.id.begin_et_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        tv_heading = findViewById(R.id.adv_heading);
        textSwitcher = findViewById(R.id.adv_textSwitcher);
        btnNext = findViewById(R.id.textSwitcher_btnNext);
        btnPrevious = findViewById(R.id.textSwitcher_btnPrevious);

        btnPrevious.setOnClickListener(this);
        btnNext.setOnClickListener(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        btnNext.setVisibility(View.GONE);
                        btnPrevious.setVisibility(View.GONE);
                        textSwitcher.setVisibility(View.GONE);
                        tv_heading.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        btnNext.setVisibility(View.GONE);
                        btnPrevious.setVisibility(View.GONE);
                        textSwitcher.setVisibility(View.GONE);
                        tv_heading.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        btnNext.setVisibility(View.VISIBLE);
                        btnPrevious.setVisibility(View.VISIBLE);
                        textSwitcher.setVisibility(View.VISIBLE);
                        tv_heading.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView text = new TextView(getApplicationContext());
                text.setTextSize(24);
                text.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                text.setTextColor(getResources().getColor(R.color.colorText));
                return text;
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textSwitcher_btnNext:
                if (currentIndex<Sayings.length-1){
                    currentIndex = currentIndex+1;
                    textSwitcher.setText(Sayings[currentIndex]);
                }
                break;

            case R.id.textSwitcher_btnPrevious:
                if(currentIndex>0){
                    currentIndex = currentIndex-1;
                    textSwitcher.setText(Sayings[currentIndex]);
                }
                break;
        }
    }
}
