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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.StackView;
import android.widget.TextView;

import com.example.kdm.android.R;

import java.util.ArrayList;
import java.util.List;

public class Advance_Stackview extends AppCompatActivity {
    TextView tv_title, tv_code;
    BottomNavigationView bottomNavigationView;
    StackView stackView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance__stackview);

        tv_title = findViewById(R.id.begin_et_title);
        tv_code = findViewById(R.id.begin_textView);
        bottomNavigationView = findViewById(R.id.begin_navigation);
        stackView = findViewById(R.id.stackView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.java:
                        tv_title.setText("Java");
                        tv_code.setText("JavaCode");
                        stackView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.xml:
                        tv_title.setText("XML");
                        tv_code.setText("XMLCode");
                        stackView.setVisibility(View.GONE);
                        tv_title.setVisibility(View.VISIBLE);
                        tv_code.setVisibility(View.VISIBLE);
                        break;

                    case R.id.tv_demo:
                        stackView.setVisibility(View.VISIBLE);
                        tv_title.setVisibility(View.GONE);
                        tv_code.setVisibility(View.GONE);
                        break;
                }
                return true;
            }
        });

        stackView.setInAnimation(this, android.R.animator.fade_in);
        stackView.setOutAnimation(this, android.R.animator.fade_out);

        StackViewAdapter albumsAdapter = new StackViewAdapter(getStores(), R.layout.item, Advance_Stackview.this);

        stackView.setAdapter(albumsAdapter);
    }
    private List<String> getStores() {
        List<String> stores = new ArrayList<String>();
        stores.add("France");
        stores.add("USA");
        stores.add("South Africa");
        stores.add("India");
        return stores;
    }
}
class StackViewAdapter extends ArrayAdapter{

    private List<String> storesList;
    private Context context;
    private int itemLayout;

    public StackViewAdapter(List<String> stores, int resource, Context ctx) {
        super(ctx, resource, stores);
        storesList = stores;
        context = ctx;
        itemLayout = resource;
    }

    @Override
    public int getCount() {
        return storesList.size();
    }

    @Override
    public String getItem(int position) {
        return storesList.get(position);
    }

    @Override
    public View getView(int position, View view, @NonNull ViewGroup parent) {

        if(view == null){
            view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        }

        String store = storesList.get(position);

        TextView storeName = view.findViewById(R.id.stack_text);
        ImageView storeImg = view.findViewById(R.id.stack_image);

        storeName.setText(store);

        int resId = context.getResources().getIdentifier(store, "drawable",context.getPackageName());

        storeImg.setImageResource(resId);

        return view;
    }
}