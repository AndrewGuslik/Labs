package com.example.rmp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        TextView textview = findViewById(R.id.editTextText);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = textview.getText().toString();
                Intent intent = new Intent(MainActivity1.this, Activity2.class);
                intent.putExtra("key", text1);
                startActivity(intent);
                finish();
            }
        });
    }


}