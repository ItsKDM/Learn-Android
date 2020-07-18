package com.example.kdm.android.Begin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_AutoComplete extends AppCompatActivity {

    TextView tv_title, tv_code, textView;
    AutoCompleteTextView acTextView;
    BottomNavigationView bottomNavigationView;

    String[] inputs = {"Australia", "Austria", "Bangladesh", "Belgium", "China", "Egypt", "France", "India", "Pakistan", "Spain", "Indonesia", "England", "America", "U.A.E", "Italy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__auto_complete);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        textView = findViewById(R.id.textView);
        acTextView = findViewById(R.id.acTextView);
        bottomNavigationView = findViewById(R.id.begin_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("1. import android.support.v7.app.AppCompatActivity;\n" +
                                "2. import android.os.Bundle;\n" +
                                "3. import android.widget.ArrayAdapter;\n" +
                                "4. import android.widget.AutoCompleteTextView;\n" +
                                "5. import android.widget.TextView;\n" +
                                "6.\n" +
                                "7.   public void MainActivity extends AppCompatActivity {\n" +
                                "8.\n" +
                                "9.       AutoCompleteTextView acTextView;\n" +
                                "10.      TextView textView;\n" +
                                "11.      String[] inputs = {''Australia'',  ''Austria'', ''Bangladesh'', ''Belgium'', ''China'', ''Egypt'', ''France'', ''India'', ''Pakistan'', ''Spain'', ''Indonesia'', ''England'', ''America'', ''U.A.E'', ''Italy''};\n" +
                                "12.\n" +
                                "13.      @Override\n" +
                                "14.      protected void onCreate(Bundle savedInstanceState) {\n" +
                                "15.            super.onCreate(savedInstanceState);\n" +
                                "16.            setContentView(R.layout.activity_main);\n" +
                                "17.\n" +
                                "18.            acTextView = findViewById(R.id.acTextView)\n" +
                                "19.            textView = findViewById(R.id.textView)\n" +
                                "20.\n" +
                                "21.            textView.setText(''Text inputs: Australia, Austria, Bangladesh, Belgium, China, Egypt, France, India, Pakistan, Spain, Indonesia, England, America, U.A.E, Italy'');\n" +
                                "22.\n" +
                                "23.            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, inputs);\n" +
                                "24.            acTextView.setAdapter(adapter);\n" +
                                "25.\n" +
                                "26.\n" +
                                "27.         }\n" +
                                "28.  }");
                        textView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        acTextView.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("1. <?xml version=''1.0'' encoding=''utf-8''?>\n" +
                                "2. <RelativeLayout\n" +
                                "3.      xmlns:android=''http://schemas.android.com/apk/res/android''\n" +
                                "4.      xmlns:app=''http://schemas.android.com/apk/res-auto''\n" +
                                "5.      xmlns:tools=''http://schemas.android.com/tools\n" +
                                "6.      android:layout_width=''match_parent''\n" +
                                "7.      android:layout_height=''match_parent''\n" +
                                "8.      android:padding=''5dp''\n" +
                                "9.      android:background=''#FFFFFF''\n" +
                                "10.     tools:context=''com.example.myapplication.MainActivity''>\n" +
                                "11.\n" +
                                "12.     <AutoCompleteTextView\n" +
                                "13.         android:id=''@id+/acTextView''\n" +
                                "14.         android:layout_width=''match_parent''\n" +
                                "15.         android:layout_height=''match_parent''\n" +
                                "16.         android:layout_centerHorizontal=''true''\n" +
                                "17.         android:layout_marginTop=''10dp''\n" +
                                "18.         android:completionThreshold=''1''/>\n" +
                                "19.\n" +
                                "20.     <TextView\n" +
                                "21.         android:id=''@+id/textView''\n" +
                                "22.         android:layout_width=''wrap_content''\n" +
                                "23.         android:layout_height=''wrap_content''\n" +
                                "24.         android:layout_below=''@id/acTextView''\n" +
                                "25.         android:layout_marginTop=''10dp''\n" +
                                "26.         android:textColor=''#000000''/>\n" +
                                "27.\n" +
                                "28.  </RelativeLayout>");
                        textView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        acTextView.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_code.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        textView.setVisibility(View.VISIBLE);
                        acTextView.setVisibility(View.VISIBLE);
                }
                return true;
            }
        });

        textView.setText("Text Inputs:\n" +
                "Australia, Austria, Bangladesh, Belgium, China, Egypt, France, India, Pakistan, Spain, Indonesia, England, America, U.A.E, Italy");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, inputs);
        acTextView.setAdapter(adapter);
    }
}
