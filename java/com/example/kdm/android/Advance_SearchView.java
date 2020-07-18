package com.example.kdm.android;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.widget.TextView;

public class Advance_SearchView extends AppCompatActivity implements SearchView.OnQueryTextListener{

    SearchView searchView;
    ListView listView;
    TextView textView, tv_title;
    BottomNavigationView bottomNavigationView;

    String[] values = {"India", "Australia", "Russia", "China", "South Africa"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__search_view);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.begin_navigation);
        textView = (TextView)findViewById(R.id.begin_textView);
        tv_title = findViewById(R.id.begin_tv_title);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        textView.setText("");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        searchView.setVisibility(View.GONE);
                        listView.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        textView.setText("");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        searchView.setVisibility(View.GONE);
                        listView.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        textView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        searchView.setVisibility(View.VISIBLE);
                        listView.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.sv_listView);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(this);
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.getFilter().filter(text);
        return false;
    }
}