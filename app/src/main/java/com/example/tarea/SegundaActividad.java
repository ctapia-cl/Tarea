package com.example.tarea;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;


public class SegundaActividad extends AppCompatActivity {
    //referencias
    private Button btnFiltrar;
    private ListView ltvTareas;
    private TextInputLayout tilBuscar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        referencias();

    }

    //region referencias y eventos
    private void referencias() {
        btnFiltrar = findViewById(R.id.btnFiltrar);
        ltvTareas = findViewById(R.id.ltvTareas);
        tilBuscar = findViewById(R.id.tilBuscar);

    }

    //endregion
}
