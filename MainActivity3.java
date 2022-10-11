package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> openactivity_main4());
    }
    public void openactivity_main4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}