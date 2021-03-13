package com.example.quiz1_ecosistemas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class SintomasScreen2 extends AppCompatActivity {

    CheckBox sin1,sin2,sin3,sin4,sin5,sin6,sin7;
    Button continuar3on;
    ConstraintLayout sintomasOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas_screen2);
        sin1 = findViewById(R.id.sin1);
        sin2 = findViewById(R.id.sin2);
        sin3 = findViewById(R.id.sin3);
        sin4 = findViewById(R.id.sin4);
        sin5 = findViewById(R.id.sin5);
        sin6 = findViewById(R.id.sin6);
        sin7 = findViewById(R.id.sin7);
        continuar3on = findViewById(R.id.continuar3on);
        sintomasOn = findViewById(R.id.sintomasOn);

        continuar3on.setOnClickListener(
                (v)->{
                    Intent r = new Intent(SintomasScreen2.this,MainActivity.class);
                    startActivity(r);
                }
        );



    }
}