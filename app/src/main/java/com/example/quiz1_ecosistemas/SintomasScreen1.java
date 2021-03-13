package com.example.quiz1_ecosistemas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SintomasScreen1 extends AppCompatActivity implements View.OnClickListener{

    CheckBox s1,s2,s3,s4,s5,s6,s7;
    Button continuar3off;
    ConstraintLayout sintomasOf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas_screen);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);
        s6 = findViewById(R.id.s6);
        s7 = findViewById(R.id.s7);
        continuar3off = findViewById(R.id.continuar3off);
        sintomasOf = findViewById(R.id.sintomasOf);

        continuar3off.setOnClickListener(
                (v)->{
                    Intent r = new Intent(SintomasScreen1.this,SintomasScreen2.class);
                    startActivity(r);
                }
        );


    }

    @Override
    public void onClick(View v) {

    }
}