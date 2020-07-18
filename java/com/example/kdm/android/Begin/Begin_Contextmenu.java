package com.example.kdm.android.Begin;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Contextmenu extends AppCompatActivity {

    TextView tv_title, tv_code, context_tv;
    BottomNavigationView bottomNavigationView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__contextmenu);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        context_tv = findViewById(R.id.context_tv);
        relativeLayout = findViewById(R.id.relativeLayout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        context_tv.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        context_tv.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        context_tv.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        registerForContextMenu(context_tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,v.getId(),0,"Blue");
        menu.add(0,v.getId(),0,"Gray");
        menu.add(0,v.getId(),0,"Green");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getTitle() == "Blue"){
            relativeLayout.setBackgroundColor(Color.BLUE);
        }
        else if(item.getTitle() == "Gray"){
            relativeLayout.setBackgroundColor(Color.GRAY);
        }
        else if(item.getTitle() == "Green"){
            relativeLayout.setBackgroundColor(Color.GREEN);
        }

        return true;
    }
}
