package com.example.kdm.android.Advance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kdm.android.Advance_SearchView;
import com.example.kdm.android.R;

public class Advance extends AppCompatActivity {

    Button btn_ts, btn_is, btn_adap_view, btn_sv, btn_anim, btn_lv, btn_cust_lv, btn_expan_lv, btn_gv, btn_wv, btn_search, btn_th, btn_vp,
    btn_fab, btn_tiet, btn_navi, btn_sheets, btn_sb, btn_navi_draw, btn_rv, btn_noti, btn_sp, btn_internal, btn_external, btn_sqlite;

    TextView tv_adv_ui, tv_containers, tv_md, tv_noti, tv_storage, tv_sqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);

        btn_ts = findViewById(R.id.btn_ts);
        btn_is = findViewById(R.id.btn_is);
        btn_adap_view = findViewById(R.id.btn_adap_view);
        btn_sv = findViewById(R.id.btn_sv);
        btn_anim = findViewById(R.id.btn_anim);
        btn_lv = findViewById(R.id.btn_lv);
        btn_cust_lv = findViewById(R.id.btn_cust_lv);
        btn_expan_lv = findViewById(R.id.btn_expan_lv);
        btn_gv = findViewById(R.id.btn_gv);
        btn_wv = findViewById(R.id.btn_wv);
        btn_search = findViewById(R.id.btn_search);
        btn_th = findViewById(R.id.btn_th);
        btn_vp = findViewById(R.id.btn_vp);
        btn_fab = findViewById(R.id.btn_fab);
        btn_tiet = findViewById(R.id.btn_tiet);
        btn_navi = findViewById(R.id.btn_navi);
        btn_sheets = findViewById(R.id.btn_bottom_sheet);
        btn_sb = findViewById(R.id.btn_sb);
        btn_navi_draw = findViewById(R.id.btn_navi_draw);
        btn_rv = findViewById(R.id.btn_rv);
        btn_noti = findViewById(R.id.btn_type);
        btn_sp = findViewById(R.id.btn_shared);
        btn_internal = findViewById(R.id.btn_internal);
        btn_external = findViewById(R.id.btn_external);
        btn_sqlite = findViewById(R.id.btn_sqlite);
        tv_adv_ui = findViewById(R.id.tv_adv_ui);
        tv_containers = findViewById(R.id.tv_containers);
        tv_md = findViewById(R.id.tv_md);
        tv_noti = findViewById(R.id.tv_noti);
        tv_storage = findViewById(R.id.tv_storage);
        tv_sqlite = findViewById(R.id.tv_sqlite);

        btn_ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Advance.this, Advance_Textswitcher.class);
                startActivity(intent);
            }
        });

        btn_is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Advance.this, Advance_Imageswitcher.class);
                startActivity(intent);
            }
        });

        btn_adap_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Advance.this, Advance_Adapterview.class);
                startActivity(intent);
            }
        });

        btn_sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Advance.this, Advance_Stackview.class);
                startActivity(intent);
            }
        });

        btn_lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Advance.this, Advance_Listview.class);
                startActivity(intent);
            }
        });

        btn_gv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Advance.this, Advance_Gridview.class);
                startActivity(intent);
            }
        });

        btn_th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Advance.this, Advance_Tabhost.class);
                startActivity(intent);
            }
        });

        btn_cust_lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Advance.this, Advance_Custom_Lv.class);
                startActivity(intent);
            }
        });

        btn_navi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Advance.this, Advance_Bottom_Navi.class);
                startActivity(intent);
            }
        });

        btn_wv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Advance.this, Advance_WebView.class);
                startActivity(i);
            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Advance.this, Advance_SearchView.class);
                startActivity(i);
            }
        });
    }
}