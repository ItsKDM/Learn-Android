package com.example.kdm.android.Begin;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Resultintent2 extends AppCompatActivity {

    TextView tv_title, tv_code;
    EditText resultintent_et1;
    Button resultintent_btn2;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__resultintent2);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        resultintent_btn2 = findViewById(R.id.resultintent_btn2);
        resultintent_et1 = findViewById(R.id.resultintent_et1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        resultintent_btn2.setVisibility(View.GONE);
                        resultintent_et1.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        resultintent_et1.setVisibility(View.GONE);
                        resultintent_btn2.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        resultintent_et1.setVisibility(View.VISIBLE);
                        resultintent_btn2.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });
    }

    public void onClick(View view){

        String name = resultintent_et1.getText().toString();

        if(name.length() == 0){
            resultintent_et1.setError("You must Enter Your Name");
        }
        else{
            Intent returnIntent = new Intent();

            returnIntent.putExtra("result", name);

            setResult(Activity.RESULT_OK, returnIntent);

            finish();
        }
    }
}
