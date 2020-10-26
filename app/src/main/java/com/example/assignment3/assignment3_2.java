package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class assignment3_2 extends AppCompatActivity {

    TextView tw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3_2);

        tw1 = findViewById(R.id.tw1);
        tw1.setText(getIntent().getStringExtra("data"));
    }
}