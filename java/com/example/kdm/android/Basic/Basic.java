package com.example.kdm.android.Basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kdm.android.AndroidStudio;
import com.example.kdm.android.Containers;
import com.example.kdm.android.Data;
import com.example.kdm.android.Firebase;
import com.example.kdm.android.Fragments;
import com.example.kdm.android.Fundamentals;
import com.example.kdm.android.IntroAndroid;
import com.example.kdm.android.JSON;
import com.example.kdm.android.Menu;
import com.example.kdm.android.ProjectStructure;
import com.example.kdm.android.R;
import com.example.kdm.android.Views;

public class Basic extends AppCompatActivity {

    Button intro_android, android_studio, android_project, android_app, android_intent, android_view, android_fragment, android_ui,
            android_container, android_menu, android_data, android_json, android_firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        intro_android = findViewById(R.id.intro_android);
        android_studio = findViewById(R.id.android_studio);
        android_project = findViewById(R.id.android_project);
        android_app = findViewById(R.id.android_app);
        android_intent = findViewById(R.id.android_intent);
        android_view = findViewById(R.id.android_view);
        android_fragment = findViewById(R.id.android_fragment);
        android_ui = findViewById(R.id.android_ui);
        android_container = findViewById(R.id.android_container);
        android_menu = findViewById(R.id.android_menu);
        android_data = findViewById(R.id.android_data);
        android_json = findViewById(R.id.android_json);
        android_firebase = findViewById(R.id.android_firebase);

        intro_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, IntroAndroid.class);
                startActivity(intent);
            }
        });

        android_studio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, AndroidStudio.class);
                startActivity(intent);
            }
        });

        android_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, ProjectStructure.class);
                startActivity(intent);
            }
        });

        android_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, Fundamentals.class);
                startActivity(intent);
            }
        });

        android_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, com.example.kdm.android.Intent.class);
                startActivity(intent);
            }
        });

        android_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, Views.class);
                startActivity(intent);
            }
        });

        android_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, Menu.class);
                startActivity(intent);
            }
        });

        android_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, Data.class);
                startActivity(intent);
            }
        });

        android_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, Fragments.class);
                startActivity(intent);
            }
        });

        android_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, Containers.class);
                startActivity(intent);

            }
        });

        android_json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, JSON.class);
                startActivity(intent);
            }
        });

        android_firebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Basic.this, Firebase.class);
                startActivity(intent);
            }
        });
    }
}
