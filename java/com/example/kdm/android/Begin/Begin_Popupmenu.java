package com.example.kdm.android.Begin;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin_Popupmenu extends AppCompatActivity {

    TextView tv_title, tv_code;
    Button popup_btn;
    BottomNavigationView bottomNavigationView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin__popupmenu);

        tv_title = findViewById(R.id.begin_tv_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        popup_btn = findViewById(R.id.popup_btn);
        relativeLayout = findViewById(R.id.relativeLayout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        popup_btn.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        popup_btn.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        popup_btn.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });
    }

    public void changeBackground(View view){

        PopupMenu popupMenu = new PopupMenu(Begin_Popupmenu.this, popup_btn);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu_main, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.white:
                        relativeLayout.setBackgroundColor(Color.WHITE);
                        break;

                    case R.id.yellow:
                        relativeLayout.setBackgroundColor(Color.YELLOW);
                        break;

                    case R.id.blue:
                        relativeLayout.setBackgroundColor(Color.BLUE);
                        break;
                }
                return true;
            }
        });
        popupMenu.show();
    }

}
