package com.example.kdm.android.Advance;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kdm.android.R;

import java.lang.reflect.Array;

public class Advance_Listview extends AppCompatActivity {

    TextView tv_title, tv_code;
    ListView listView;
    BottomNavigationView bottomNavigationView;

    String[] items ={"Bitcoin", "Ethereum", "LiteCoin", "Dash", "Neo", "Nano", "Bitcoin Cash", "Verge", "Ripple", "Bitcoin Diamond", "Economic", "Stellar Lumens"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__listview);

        listView = findViewById(R.id.listView);
        tv_title = findViewById(R.id.begin_et_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        listView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        listView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        listView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, items);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition = position;

                String itemValue =(String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),"Postion: " + itemPosition + " Item Clicked " + itemValue, Toast.LENGTH_LONG).show();
            }
        });

    }
}
