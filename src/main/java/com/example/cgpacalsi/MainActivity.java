package com.example.cgpacalsi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1= findViewById(R.id.button);
        b1.setOnClickListener(v -> {
            Intent i=new Intent(getApplicationContext(),Sub.class);
            startActivity(i);

        });

    }
}