package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;   
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout tilTitulo, tilDescripcion;
    private Button btnIngresar, btnModificar, btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencias();
        eventos();
    }

    private void mostrarNombreEnOtraActividad(){
        Comuna comunaUno = new Comuna();

        comunaUno.setNombre("Quinta Normal");
        comunaUno.setPoblacion(10000);
        comunaUno.setAlcalde("Juanito Perez");
        comunaUno.setGrupoGSE("C2");
        comunaUno.setMt2(20000.76f);
        comunaUno.setDireccionMunicipalidad("Los pinos oriente 1234");


        String nombre = tilTitulo.getEditText().getText().toString();

        Intent segundaPantalla = new Intent(this,SegundaActividad.class);
        segundaPantalla.putExtra("datoNombre", nombre);
        segundaPantalla.putExtra("datosComuna", comunaUno);

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
        btnModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void referencias(){
        tilTitulo = findViewById(R.id.tilTitulo);
        tilDescripcion = findViewById(R.id.tilDescripcion);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnModificar = findViewById(R.id.btnModificar);
        btnBuscar = findViewById(R.id.btnBuscar);
    }
//endregion
