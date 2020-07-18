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

import org.w3c.dom.Text;

public class Begin_TextView extends AppCompatActivity {

    TextView textView, tv_title, tv_demo1;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__text_view);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.begin_navigation);
        textView = (TextView)findViewById(R.id.begin_textView);
        tv_demo1 = (TextView)findViewById(R.id.begin_btn_tv);
        tv_title = (TextView) findViewById(R.id.begin_tv_title);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        textView.setText(" 1. import android.widget,TextView;\n" +
                                "2. import android.widget.Toast;\n" +
                                "3.\n" +
                                "4. public class MainActivity extends Activity {\n" +
                                "5.    @Override\n" +
                                "6.     protected void onCreate(Build savedInstanceState) {\n" +
                                "7.          super.onCreate(savedInstanceState);\n" +
                                "8.          setContentView(R.layout.activity_main);\n" +
                                "9.\n" +
                                "10.         TextView txtView = (TextView) findViewBy Id(R.id.text);\n" +
                                "11.\n" +
                                "12.         text.setOnClickListener(new View.OnClickListener() {\n" +
                                "13.\n" +
                                "14.              @Override\n" +
                                "15.              public void onClick(view view) {\n" +
                                "16.                  text.setText(''You clicked the TextView.'');\n" +
                                "17.            }\n" +
                                "18.         });\n" +
                                "19.      }\n" +
                                "20.  }");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_demo1.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        textView.setText("1. <?xml version=''1.0'' encoding=''utf-8''?>\n" +
                                "2. <RelativeLayout xmlns:android=''http://schemas.android.cam/apk/res/android''\n" +
                                "3. xmlns:tools=''http://schemas.android.com/tools''\n" +
                                "4. android:layout_width=''match_parent''\n" +
                                "5. android:layout_height=''match_parent''\n" +
                                "6. tools:context=''MainActivity''>\n" +
                                "7. \n" +
                                "8.     <TextView\n" +
                                "9.         android:id=''@+id/text\n" +
                                "10.        android:layout_width=''match_parent''\n" +
                                "11.        android:layout_height=''match_parent''\n" +
                                "12.        android:text=''This is a TextView!\n" +
                                "13.        android:textSize=''20sp''\n" +
                                "14.        android:textColor=''#FFFFFF\n" +
                                "15.        android:layout_centerVertical=''true''\n" +
                                "16.        android:layout_centerHorizontal=''true''\n" +
                                "17.        android:textStyle=''bold''/>\n" +
                                "18. \n" +
                                "19. </RelativeLayout>");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_demo1.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_demo1.setText("This is a TextView!");
                        textView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        tv_demo1.setVisibility(View.VISIBLE);
                        break;
                }
            return true;
            }
        });

        tv_demo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_demo1.setText("You Clicked the Text View!");
            }
        });
    }
}
