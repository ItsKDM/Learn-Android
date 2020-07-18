package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_EditText extends AppCompatActivity {

    TextView et_title, textView, et_tv_demo;
    EditText et_demo;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__edit_text);

        et_title = (TextView)findViewById(R.id.begin_et_title);
        textView = (TextView)findViewById(R.id.begin_textView);
        et_tv_demo = (TextView)findViewById(R.id.et_tv_demo);
        et_demo = (EditText)findViewById(R.id.et_demo);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.java:
                        et_title.setText("Java");
                        textView.setText("1. import android.support.v7.app.AppCompatActivity;\n" +
                                "2. import android.os.Bundle;\n" +
                                "3. import android.text.Editable;\n" +
                                "4. import android.text.TextWatcher;\n" +
                                "5. import android.widget.EditText\n" +
                                "6. import android.widget.TextView\n" +
                                "7. \n" +
                                "8. public class MainActivity extends AppCompatActivity {\n" +
                                "9. \n" +
                                "10.   EditText editText;\n" +
                                "11.   TextView textView;\n" +
                                "12.\n" +
                                "13.   @Override\n" +
                                "14.   protected void onCreate(Bundle savedInstanceState) {\n" +
                                "15.      super.onCreate(savedInstanceState);\n" +
                                "16.      setContentView(R.layout.activity_main);\n" +
                                "17.\n" +
                                "18.      editText = (EditText)findViewById(R.id.editText);\n" +
                                "19.\n" +
                                "20.      textText = (TextView)findViewById(R.id.textView);\n" +
                                "21.\n" +
                                "22.      editText.addTextChangedListener(new TextWatcher()  {\n" +
                                "23.         @Override\n" +
                                "24.         public void beforeTextChanged(CharSequence s, int start, int count, int after) {\n" +
                                "25.\n" +
                                "26.         }\n" +
                                "27.\n" +
                                "28.         @Override\n" +
                                "29.         public void onTextChanged(CharSequence s, int start, int before, int count) {\n" +
                                "30.\n" +
                                "31.         }\n" +
                                "32.\n" +
                                "33.         @Override\n" +
                                "34.         public void afterTextChanged(Editable s) {\n" +
                                "35.             String name = editText.getText().toString();\n" +
                                "36.             textView.setText(''Hi ''+name);\n" +
                                "37.          }\n" +
                                "38.      });\n" +
                                "39.    }\n" +
                                "40. }\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n");
                        textView.setVisibility(View.VISIBLE);
                        et_title.setVisibility(View.VISIBLE);
                        et_demo.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        et_title.setText("XML");
                        textView.setText("1. <?xml version=''1.0'' encoding=''utf-8''?>\n" +
                                "2. <RelativeLayout xmlns:android=''http://schemas.android.cam/apk/res/android''\n" +
                                "3. xmlns:tools=''http://schemas.android.com/tools''\n" +
                                "4. android:layout_width=''match_parent''\n" +
                                "5. android:layout_height=''match_parent''+\n" +
                                "6. tools:context=''com.example.MainActivity''>\n" +
                                "7. android:padding=''16dp''\n" +
                                "8.\n" +
                                "9.     <EditText\n" +
                                "10.            android:id=''@+id/editText''\n" +
                                "11.            android:layout_width=''match_parent''\n" +
                                "12.            android:layout_height=''wrap_content''\n" +
                                "13.            android:layout_centerHorizontal=''true''\n" +
                                "14.            android:hint=''Enter your Name\n" +
                                "15.            android:layout_marginTop=''150dp''\n" +
                                "16.            android:inputType=''text''/>\n" +
                                "17.\n" +
                                "18.    <TextView\n" +
                                "19.            android:id=''@+id/textView''\n" +
                                "20.            android:layout_width=''wrap_content''\n" +
                                "21.            android:layout_height=''wrap_content''\n" +
                                "22.            android:layout_marginTop=''75dp''\n" +
                                "23.            android:layout_centerVertical=''true''\n" +
                                "24.            android:layout_centerHorizontal=''true''\n" +
                                "25.            android:textStyle=''bold''\n" +
                                "26.            android:textColor=''#000000''/>\n" +
                                "27.\n" +
                                "28. </RelativeLayout>");
                        textView.setVisibility(View.VISIBLE);
                        et_title.setVisibility(View.VISIBLE);
                        et_demo.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        et_demo.setText("");
                        et_title.setVisibility(View.GONE);
                        textView.setVisibility(View.GONE);
                        et_demo.setVisibility(View.VISIBLE);
                        et_tv_demo.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        et_demo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                et_tv_demo.setVisibility(View.GONE);

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                et_tv_demo.setVisibility(View.VISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
                String name = et_demo.getText().toString();
                et_tv_demo.setText("Hello " + name);
            }
        });

    }
}
