package com.example.kdm.android.Advance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kdm.android.R;

public class Advance_Gridview extends AppCompatActivity {

    TextView tv_title, tv_code;
    BottomNavigationView bottomNavigationView;
    GridView gridView;

    String[] items = {"Apple", "Instagram", "Adidas", "Amazon", "Google"};

    Integer[] logo = {R.drawable.apple, R.drawable.insta, R.drawable.adidas, R.drawable.amazon, R.drawable.google};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__gridview);

        tv_title = findViewById(R.id.begin_et_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        gridView = findViewById(R.id.gridView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        gridView.setVisibility(View.GONE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        gridView.setVisibility(View.GONE);
                        break;

                    case R.id.tv_demo:
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        gridView.setVisibility(View.VISIBLE);
                }
                return true;
            }
        });


        CustomAdapter adapter = new CustomAdapter(Advance_Gridview.this, items, logo);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String) gridView.getItemAtPosition(position);

                Toast.makeText(Advance_Gridview.this, itemValue, Toast.LENGTH_SHORT).show();
            }
        });

    }

    class CustomAdapter extends ArrayAdapter<String> {

        private final Context context;
        private final String[] items;
        private final Integer[] logo;


        public CustomAdapter(Context context, String[] items, Integer[] logo) {
            super(context, R.layout.custom_layout_grid, items);

            this.context = context;
            this.items = items;
            this.logo = logo;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.custom_layout_grid, null, true);

            TextView title = (TextView)rowView.findViewById(R.id.grid_tv);

            ImageView image = (ImageView)rowView.findViewById(R.id.grid_iv);

            title.setText(items[position]);

            image.setImageResource(logo[position]);

            return rowView;
        }
    }



}
