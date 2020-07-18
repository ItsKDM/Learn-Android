package com.example.kdm.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProjectStructure extends AppCompatActivity {

    TextView tv_structure, tv_structure_content;
    ImageView iv_structure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_structure);

        tv_structure = findViewById(R.id.tv_structure);
        tv_structure_content = findViewById(R.id.tv_structure_content);
        iv_structure = findViewById(R.id.iv_structure);

    }
}
