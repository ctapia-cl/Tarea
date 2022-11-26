package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    private void mostrarNombreEnOtraActividad(){
        Tareas tareaUno = new Tareas();

        tareaUno.setTitulo("Ingrese el Título de la Tarea");
        tareaUno.setDescripcion("Ingrese una Descripción");



        String titulo = tilTitulo.getEditText().getText().toString();

        Intent segundaPantalla = new Intent(this,SegundaActividad.class);
        segundaPantalla.putExtra("Titulo Tarea", titulo);
        segundaPantalla.putExtra("Descripción", tareaUno);

        startActivity(segundaPantalla);
    }



    //region Eventos y referencias
    private void eventos(){
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarNombreEnOtraActividad();
            }
        });



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