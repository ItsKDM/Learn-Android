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
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Advance_Adapterview extends AppCompatActivity {

    TextView tv_title, tv_code, adapter_heading;
    AdapterViewFlipper adapterViewFlipper;
    BottomNavigationView bottomNavigationView;

    int[] IMAGES = {
      R.drawable.apple,
      R.drawable.amazon,
      R.drawable.adidas,
      R.drawable.google,
      R.drawable.insta,
    };

    String[] NAMES = {
            "Apple",
            "AMAZON",
            "ADIDAS",
            "GOOGLE",
            "INSTAGRAM"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__adapterview);

        tv_title = findViewById(R.id.begin_et_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        adapter_heading = findViewById(R.id.adapter_heading);
        adapterViewFlipper = findViewById(R.id.adapterViewFlipper);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        adapterViewFlipper.setVisibility(View.GONE);
                        adapter_heading.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        adapterViewFlipper.setVisibility(View.GONE);
                        adapter_heading.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        adapterViewFlipper.setVisibility(View.VISIBLE);
                        adapter_heading.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), NAMES, IMAGES);

        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2600);
        adapterViewFlipper.setAutoStart(true);
    }

    class CustomAdapter extends BaseAdapter{
        Context context;
        int[] images;
        String[] names;
        LayoutInflater inflater;

        public CustomAdapter(Context applicationContext, String[] names, int[] images) {

            this.context = applicationContext;
            this.images = images;
            this.names = names;
            inflater = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = inflater.inflate(R.layout.list_item, null);
            TextView name = view.findViewById(R.id.adapter_tv);
            ImageView image = view.findViewById(R.id.adapter_iv);
            name.setText(names[position]);
            image.setImageResource(images[position]);
            return view;
        }
    }

}
