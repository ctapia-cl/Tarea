package com.example.tarea;

import java.io.Serializable;

//array list de tareas
public class Tareas implements Serializable {
    private String titulo;
    private String descripcion;

    public String toString() {
        return titulo + " : descripcion : " + descripcion;
    }


    public void setTitulo(String nuevoTitulo){
        titulo = nuevoTitulo;
    }

    public String getTitulo(){
        return titulo;
    }



    public void setDescripcion(String nuevoDescripcion){
        descripcion = nuevoDescripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

}
