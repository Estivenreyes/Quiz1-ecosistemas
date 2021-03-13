package com.example.quiz1_ecosistemas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterScreen extends AppCompatActivity {

    TextView nombre;
    EditText identificacion;
    Button continua1;
    ConstraintLayout registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        nombre = findViewById(R.id.nombre);
        identificacion = findViewById(R.id.identificacion);
        continua1 = findViewById(R.id.continuar1);
        registro = findViewById(R.id.registro);


        continua1.setOnClickListener(
                (v)->{

                    if (validarRegistro()){
                        Intent c1 = new Intent(RegisterScreen.this,ChooseScreen1.class);
                        startActivity(c1);
                    } else{
                        Toast.makeText(this,"Por favor complete los campos",Toast.LENGTH_LONG).show();
                    }

                }
        );

    }

    public boolean validarRegistro(){
        if(nombre.getText().toString().equals("")  || identificacion.getText().toString().equals("")){
            return false;
        }else{
            return true;
        }
    }

}