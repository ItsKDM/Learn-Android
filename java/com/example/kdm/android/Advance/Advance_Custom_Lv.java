package com.example.kdm.android.Advance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Advance_Custom_Lv extends AppCompatActivity {

    TextView textView, tv_title;
    BottomNavigationView bottomNavigationView;
    ListView listView;

    String[] items = {"Apple", "Instagram", "Adidas", "Amazon", "Google"};

    Integer[] logo = {R.drawable.apple, R.drawable.insta, R.drawable.adidas, R.drawable.amazon, R.drawable.google};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__custom__lv);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.begin_navigation);
        textView = (TextView)findViewById(R.id.begin_textView);
        tv_title = (TextView) findViewById(R.id.begin_tv_title);
        listView = findViewById(R.id.listView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        textView.setText("");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        textView.setText("");
                        textView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        textView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        CustomAdapter adapter = new CustomAdapter(Advance_Custom_Lv.this, items, logo);

        listView.setAdapter(adapter);

    }

    class CustomAdapter extends ArrayAdapter<String>{

        private final Context context;
        private final String[] items;
        private final Integer[] logo;

        public CustomAdapter(Context context, String[]items, Integer[] logo){
            super(context, R.layout.custom_lv_layout, items);
            this.context = context;
            this.items = items;
            this.logo = logo;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View rowView = inflater.inflate(R.layout.custom_lv_layout, null, true);

            TextView title = (TextView) findViewById(R.id.custom_lv_tv);
            ImageView image = (ImageView) findViewById(R.id.custom_lv_iv);

            title.setText(items[position]);

            image.setImageResource(logo[position]);

            return rowView;
        }
    }
}