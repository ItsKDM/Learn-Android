package com.example.kdm.android.Begin;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_ImageView extends AppCompatActivity {
    TextView tv_title, tv_code, tv_iv;
    ImageView imageView;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__image_view);

        tv_title = (TextView)findViewById(R.id.begin_tv_title);
        tv_code = (TextView)findViewById(R.id.begin_textView);
        tv_iv = (TextView)findViewById(R.id.begin_iv_content);
        imageView = (ImageView)findViewById(R.id.begin_iv);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("1. import android.support.v7.app.AppCompat.Actvivty;\n" +
                                "2. import android.os.Bundle;\n" +
                                "3. import android.view.View;\n" +
                                "4. import android.widget.ImageView;\n" +
                                "5. import android.widget.TextView;\n" +
                                "6.\n" +
                                "7.  public class MainActivity extends AppCompatActivity {\n" +
                                "8.      TextView textView;\n" +
                                "9.      ImageView imageView;\n" +
                                "10.\n" +
                                "11.      @Override\n" +
                                "12.      protected void onCreate(Bundle savedInstanceState) {\n" +
                                "13.          super.onCreate(savedInstanceState);\n" +
                                "14.          setContentView(R.layout.activity_main);\n" +
                                "15.\n" +
                                "16.          imageView = (ImageView)findViewById(R.id.image);\n" +
                                "17.          TextView (TextView)findViewById(R.id.textView);\n" +
                                "18.\n" +
                                "19.          imageView.setOnClickListener(new View.OnClickListener) {\n" +
                                "20.            @Override\n" +
                                "21.            public void onClick(View v) {\n" +
                                "22.                 textView.setText(''You Clicked Android!!'');\n" +
                                "23.              }\n" +
                                "24.          });\n" +
                                "25.       }\n" +
                                "26.   }");
                        tv_code.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        imageView.setVisibility(View.GONE);
                        tv_iv.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("1. <?xml version=''1.0'' encoding=''utf-8''?>\n" +
                                "2. <RelativeLayout xmlns:android=''http://schemas.android.com/apk/res/android''\n" +
                                "3.    xmlns:app=''http://schemas.android.com/apk/res-auto''\n" +
                                "4.    xmlns:tools=''http://schemas.android.com/tools''\n" +
                                "5.    android:layout_width=''match_parent''\n" +
                                "6.    android:layout_height=''match_parent''\n" +
                                "7.    android:padding=''5dp''\n" +
                                "8.    tools:context=''.com.example.myapplication.MainActivity''>\n" +
                                "9.\n" +
                                "10.   <ImageView\n" +
                                "11.       android:id=''@+id/image''\n" +
                                "12.       android:layout_width=''wrap_content''\n" +
                                "13.       android:layout_height=''wrap_content''\n" +
                                "14.       android:layout_centerHorizontal=''true''\n" +
                                "15.       android:src=''@drawable/android''>\n" +
                                "16.\n" +
                                "17.    <TextView\n" +
                                "18.       android:id=''@+id/textView''\n" +
                                "19.       android:layout_width=''wrap_content''\n" +
                                "20.       android:layout_height=''wrap_content''\n" +
                                "21.       android:layout_marginTop=''100dp''\n" +
                                "22.       android:layout_centerVertical=''true''\n" +
                                "23.       android:layout_centerHorizontal=''true''\n" +
                                "24.       android:textStyle=''bold''\n" +
                                "25.       android:textColor=''@color/black''/>\n" +
                                "26.\n" +
                                "27. </RelativeLayout>");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        imageView.setVisibility(View.GONE);
                        tv_iv.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_iv.setText("");
                        tv_code.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        tv_iv.setVisibility(View.VISIBLE);
                        imageView.setVisibility(View.VISIBLE);
                }
                return true;
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_iv.setText("You Clicked Android!!");
                tv_iv.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.VISIBLE);
            }
        });
    }
}
