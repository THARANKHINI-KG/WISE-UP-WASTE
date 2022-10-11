package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> openactivity_main());
    }
    public void openactivity_main() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}