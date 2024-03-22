package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class segundaPantalla extends AppCompatActivity {


    public void cerrarSesion(View view) {
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
    }
}