package com.example.rmp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView textview = findViewById(R.id.textView);
        Bundle arguments = getIntent().getExtras();

        String name = arguments.get("key").toString();
        textview.setText("Фамилия: " + name);
    }
}