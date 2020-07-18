package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Button extends AppCompatActivity {

    TextView tv_title, tv_code, tv_btn;
    Button btn_btn;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__button);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code =  findViewById(R.id.begin_textView);
        tv_btn = findViewById(R.id.tv_btn);
        btn_btn = findViewById(R.id.begin_btn_btn);
        bottomNavigationView = findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("1. import android.os.Bundle;\n" +
                                "2. import android.view.View;\n" +
                                "3. import android.widget.Button;\n" +
                                "4. import android.widget.TextView;\n" +
                                "5.\n" +
                                "6.  public class MainActivity extends AppCompatActivity {\n" +
                                "7.\n" +
                                "8.      Button button;\n" +
                                "9.      TextView textView;\n" +
                                "10.      @Override\n" +
                                "11.      protected void onCreate(Bundle savedInstanceState) {\n" +
                                "12.          super.onCreate(savedInstanceState);\n" +
                                "13.          setContentView(R.layout.activity_main);\n" +
                                "14.\n" +
                                "15.          button = (Button)findViewById(R.id.button);\n" +
                                "16.          textView = (TextView)findViewById(R.id.textView);\n" +
                                "17.\n" +
                                "18.          button.setOnClickListener(new View.OnClickListener() {\n" +
                                "19.             @Override\n" +
                                "20.             public void onClick(view v)  {\n" +
                                "21.                 textView.setText(''You Clicked Button!!'');\n" +
                                "22.               }\n" +
                                "23.           });\n" +
                                "24.       }\n" +
                                "25.   }" );
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        btn_btn.setVisibility(View.GONE);
                        tv_btn.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("<?xml version=''1.0'' encoding=''utf=8''?>\n" +
                                "2. <RelativeLayout xmlns:android=''http://schemas.android.com/apk/res/android''\n" +
                                "3.      xmlns:app=''http://schemas.android.com/apk/res-auto''\n" +
                                "4.      xmlns:tools=''http://schemas.android.com/tools''\n" +
                                "5.      android:layout_width=''match_parent''\n" +
                                "6.      android:layout_height=''match_parent''\n" +
                                "7.      android:padding=''16dp''\n" +
                                "8.      android:background=''@color/white''\n" +
                                "9.      tools:context=''com.example.myapplication.MainActivity''\n" +
                                "10.\n" +
                                "11.     <Button\n" +
                                "12.         android:id=''@+id/button''\n" +
                                "13.         android:layout_width=''match_parent''\n" +
                                "14.         android:layout_height=''match_parent''\n" +
                                "15.         android:layout_centerHorizontal=''true''\n" +
                                "16.         android:layout_centerVertical=''true''\n" +
                                "17.         android:text=''Click Me''/>\n" +
                                "18.\n" +
                                "19.     <TextView\n" +
                                "20.         android:id=''@+id/textView''\n" +
                                "21.         android:layout_width=''match_parent''\n" +
                                "22.         android:layout_height=''match_parent''\n" +
                                "23.         android:textStyle=''bold''\n" +
                                "24.         android:layout_centerVertical=''true''\n" +
                                "25.         android:layout_centerHorizontal=''true''\n" +
                                "26.         android:layout_below=''@+id/button''\n" +
                                "27.         android:textColor=''@color/black''\n" +
                                "28.         android:layout_marginTop=''20dp''/>\n" +
                                "29.\n" +
                                "30.      </RelativeLayout>");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        btn_btn.setVisibility(View.GONE);
                        tv_btn.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:

                        tv_btn.setVisibility(View.GONE);
                        btn_btn.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                }
                return true;
            }
        });

        btn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_btn.setText("You Clicked Button!!");
                tv_btn.setVisibility(View.VISIBLE);
            }
        });

    }
}
