package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kdm.android.R;

public class Begin_Simple_Custom extends AppCompatActivity {

    TextView tv_title, tv_code;
    Button btn1, btn2;
    LayoutInflater layoutInflater;
    View toastLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__simple_custom);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        bottomNavigationView = findViewById(R.id.begin_navigation);

        layoutInflater = getLayoutInflater();
        toastLayout = layoutInflater.inflate(R.layout.custom_layout,(ViewGroup) findViewById(R.id.custom_layout));

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        btn1.setVisibility(View.GONE);
                        btn2.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        btn1.setVisibility(View.GONE);
                        btn2.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        btn1.setVisibility(View.VISIBLE);
                        btn2.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

    }

    public void simpleToastClick(View v){
        Toast.makeText(this, "It's a Simple Toast.", Toast.LENGTH_SHORT).show();
    }

    public void customToastClick(View v){
        Toast toast = Toast.makeText(this,"Toast:Gravity.TOP", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(toastLayout);
        toast.show();
    }
}
