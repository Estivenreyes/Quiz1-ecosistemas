package com.example.quiz1_ecosistemas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ChooseScreen2 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3,ch4,ch5;
    Button continuar2on;
    ConstraintLayout nexoOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_screen2);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch5 = findViewById(R.id.ch5);
        nexoOn = findViewById(R.id.nexoOn);

        continuar2on.setOnClickListener(
                (v)->{
                    Intent i = new Intent(ChooseScreen2.this,SintomasScreen1.class);
                    startActivity(i);
                }
        );

    }
}