package com.example.kdm.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Tips extends AppCompatActivity {

    Button btn_gt, btn_help, btn_useful, btn_imp_lib, btn_shortcuts, btn_aso, btn_monet, btn_boost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        btn_gt = findViewById(R.id.btn_gt);
        btn_help = findViewById(R.id.btn_help);
        btn_useful = findViewById(R.id.btn_useful);
        btn_imp_lib = findViewById(R.id.btn_imp_lib);
        btn_shortcuts = findViewById(R.id.btn_shortcuts);
        btn_aso = findViewById(R.id.btn_aso);
        btn_monet = findViewById(R.id.btn_monet);
        btn_boost = findViewById(R.id.btn_boost);
    }
}
