package com.example.quiz1_ecosistemas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ChooseScreen1 extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1,c2,c3,c4,c5;
    Button continuar2of;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_screen1);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        continuar2of = findViewById(R.id.continuar2of);

        continuar2of.setOnClickListener(
                (v)->{
                    Intent i = new Intent(ChooseScreen1.this,ChooseScreen2.class);
                    startActivity(i);
                }
        );


    }

    @Override
    public void onClick(View v) {

    }
}