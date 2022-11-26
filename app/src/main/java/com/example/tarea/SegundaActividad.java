
package com.example.tarea;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;


public class SegundaActividad extends AppCompatActivity {
    private TextView tvTitulo, tvDescripcion;
    private Button btnFiltrar;
    private ListView ltvTareas;
    private TextInputLayout tilBuscar;

    //adaptador de lista
    private ArrayAdapter<Tareas> adaptadorTareasLista;

    //lista de tareas
    private ArrayList<Tareas> lasTareasLista;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        referencias();
        obtenerDatos();


        adaptadorTareasLista = new ArrayAdapter<Tareas>(this, android.R.layout.simple_list_item_1, lasTareasLista);
        ltvTareas.setAdapter(adaptadorTareasLista);
    }

    private void obtenerDatos() {
        Tareas tareas = (Tareas) getIntent().getExtras().getSerializable("datosTareas");

        for(int x = 0; x <= 1000; ++x){
            Tareas c = new Tareas();
            c.setTitulo("Titulo ejemplo N° " + x);
            c.setDescripcion("Breve descripcion de la tarea N° " + x);
            lasTareasLista.add(c);
        }
    }


    //region referencias y eventos
    private void referencias() {
        btnFiltrar = findViewById(R.id.btnFiltrar);
        ltvTareas = findViewById(R.id.ltvTareas);
        tilBuscar = findViewById(R.id.tilBuscar);

        lasTareasLista = new ArrayList<Tareas>();

    }

    //endregion
}
