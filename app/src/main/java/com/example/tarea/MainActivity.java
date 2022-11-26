package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout tilTitulo, tilDescripcion;
    private Button btnIngresar, btnModificar;
    private ImageButton btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencias();
        eventos();
    }




    //region Eventos y referencias
    private void eventos(){

    }

    private void referencias(){
        tilTitulo = findViewById(R.id.tilTitulo);
        tilDescripcion = findViewById(R.id.tilTitulo);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnModificar = findViewById(R.id.btnModificar);
        btnBuscar = findViewById(R.id.btnBuscar);
    }
    //endregion
}