package com.example.cgpacalsi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class firstsem extends AppCompatActivity {
    EditText m1,a1,p1,ac1,r1,o1,al1,pl1,cl1;
    Button b1;
    TextView t1;
    int m,a,p,ac,r,o,al,pl,cl;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstsem);
        m1=findViewById(R.id.ed1);
        a1=findViewById(R.id.ed2);
        p1=findViewById(R.id.ed3);
        ac1=findViewById(R.id.ed4);
        r1=findViewById(R.id.ed5);
        o1=findViewById(R.id.ed6);
        al1=findViewById(R.id.al);
        pl1=findViewById(R.id.pl);
        cl1=findViewById(R.id.cl);
        b1=findViewById(R.id.button);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(v -> {
            m=Integer.parseInt(m1.getText().toString());
            a=Integer.parseInt(a1.getText().toString());
            p=Integer.parseInt(p1.getText().toString());
            ac=Integer.parseInt(ac1.getText().toString());
            r=Integer.parseInt(r1.getText().toString());
            o=Integer.parseInt(o1.getText().toString());
            al=Integer.parseInt(al1.getText().toString());
            pl=Integer.parseInt(pl1.getText().toString());
            cl=Integer.parseInt(cl1.getText().toString());

            int y=((4 * m)+(a*3)+(p *3)+(ac*4)+(r*2)+(o*3)+(al*2)+(pl*2)+(cl));
            int h=y/24;
            t1.setText(h);



        });

    }
}