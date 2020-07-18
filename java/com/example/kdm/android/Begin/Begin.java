package com.example.kdm.android.Begin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kdm.android.R;

public class Begin extends AppCompatActivity {

    Button btn_tv, btn_et, btn_iv, btn_btn, btn_auto_tv, btn_radio, btn_checkbox, btn_switch, btn_toggle, btn_rating, btn_seek, btn_progress,
            btn_spinner, btn_tp, btn_dp, btn_simple_toast, btn_ad, btn_ab, btn_opt, btn_context, btn_popup, btn_simple, btn_data, btn_start, btn_fragment;
    TextView tv_ui, tv_menu, tv_intent, tv_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        btn_tv = findViewById(R.id.btn_tv);
        btn_et = findViewById(R.id.btn_et);
        btn_iv = findViewById(R.id.btn_iv);
        btn_btn = findViewById(R.id.btn_btn);
        btn_auto_tv = findViewById(R.id.btn_auto_tv);
        btn_radio = findViewById(R.id.btn_radio);
        btn_checkbox = findViewById(R.id.btn_checkbox);
        btn_switch = findViewById(R.id.btn_switch);
        btn_toggle = findViewById(R.id.btn_toggle);
        btn_rating = findViewById(R.id.btn_rating);
        btn_seek = findViewById(R.id.btn_seek);
        btn_progress = findViewById(R.id.btn_progress);
        btn_spinner = findViewById(R.id.btn_spinner);
        btn_tp = findViewById(R.id.btn_tp);
        btn_dp = findViewById(R.id.btn_dp);
        btn_simple_toast = findViewById(R.id.btn_simple_toast);
        btn_ad = findViewById(R.id.btn_ad);
        btn_ab = findViewById(R.id.btn_ab);
        btn_opt = findViewById(R.id.btn_opt);
        btn_context = findViewById(R.id.btn_context);
        btn_popup = findViewById(R.id.btn_popup);
        btn_simple = findViewById(R.id.btn_simple);
        btn_data = findViewById(R.id.btn_data);
        btn_start = findViewById(R.id.btn_start);
        btn_fragment = findViewById(R.id.btn_fragment);
        tv_ui = findViewById(R.id.tv_ui);
        tv_menu = findViewById(R.id.tv_menu);
        tv_intent = findViewById(R.id.tv_intent);
        tv_fragment = findViewById(R.id.tv_fragment);

        btn_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.content.Intent intent = new Intent(Begin.this, Begin_TextView.class);
                startActivity(intent);
            }
        });

        btn_et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_EditText.class);
                startActivity(intent);
            }
        });

        btn_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_ImageView.class);
                startActivity(intent);
            }
        });

        btn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Button.class);
                startActivity(intent);
            }
        });

        btn_auto_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_AutoComplete.class);
                startActivity(intent);
            }
        });

        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Radio.class);
                startActivity(intent);
            }
        });

        btn_checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_CheckBox.class);
                startActivity(intent);
            }
        });

        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Switch.class);
                startActivity(intent);
            }
        });

        btn_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Toggle.class);
                startActivity(intent);
            }
        });

        btn_simple_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Simple_Custom.class);
                startActivity(intent);
            }
        });

        btn_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Ratingbar.class);
                startActivity(intent);
            }
        });

        btn_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Seekbar.class);
                startActivity(intent);
            }
        });

        btn_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Progressbar.class);
                startActivity(intent);
            }
        });

        btn_tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Time.class);
                startActivity(intent);
            }
        });

        btn_dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Begin.this, Begin_Date.class);
                startActivity(intent);
            }
        });

        btn_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Begin.this, Begin_Alertdialog.class);
                startActivity(intent);
            }
        });

        btn_ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Begin.this, Begin_Actionbar.class);
                startActivity(intent);
            }
        });

        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Begin.this, Begin_Spinner.class);
                startActivity(intent);
            }
        });

        btn_opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Begin.this, Begin_Optionmenu.class);
                startActivity(intent);
            }
        });

        btn_context.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Begin.this, Begin_Contextmenu.class);
                startActivity(intent);
            }
        });

        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Begin.this, Begin_Popupmenu.class);
                startActivity(intent);
            }
        });

        btn_simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Begin.this, Begin_Simpleintent1.class);
                startActivity(intent);
            }
        });

        btn_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Begin.this, Begin_Senddataintent1.class);
                startActivity(intent);
            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Begin.this, Begin_Resultintent1.class);
                startActivity(intent);
            }
        });
    }
}