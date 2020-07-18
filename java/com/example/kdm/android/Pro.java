package com.example.kdm.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Pro extends AppCompatActivity {

    Button btn_download, btn_torch, btn_qr, btn_stot, btn_ttos, btn_bitcoin, btn_firebase, btn_yt, btn_convert, btn_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);

        btn_download = findViewById(R.id.btn_download);
        btn_torch = findViewById(R.id.btn_torch);
        btn_qr = findViewById(R.id.btn_qr);
        btn_stot = findViewById(R.id.btn_stot);
        btn_ttos = findViewById(R.id.btn_ttos);
        btn_bitcoin = findViewById(R.id.btn_bitcoin);
        btn_firebase = findViewById(R.id.btn_firebase);
        btn_yt = findViewById(R.id.btn_yt);
        btn_convert = findViewById(R.id.btn_convert);
        btn_pdf = findViewById(R.id.btn_pdf);

    }
}
