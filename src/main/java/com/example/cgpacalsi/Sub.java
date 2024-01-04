package com.example.cgpacalsi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sub extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b1.setOnClickListener(v -> {
            Intent i=new Intent(getApplicationContext(), firstsem.class);
            startActivity(i);
        });
        b2.setOnClickListener(v -> {
            Intent j=new Intent(getApplicationContext(), secondsem.class);
            startActivity(j);
        });
        b3.setOnClickListener(v -> {
            Intent k=new Intent(getApplicationContext(), thirdsem.class);
            startActivity(k);
        });


    }
}