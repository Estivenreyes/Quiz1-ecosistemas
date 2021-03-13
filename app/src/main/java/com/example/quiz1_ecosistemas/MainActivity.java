package com.example.quiz1_ecosistemas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button registrar;
    ConstraintLayout encuestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registrar = findViewById(R.id.registrar);
        encuestas = findViewById(R.id.encuestas);

        registrar.setOnClickListener(
                (v)->{
                    Intent r = new Intent(MainActivity.this,RegisterScreen.class);
                    startActivity(r);
                }
        );

    }

}