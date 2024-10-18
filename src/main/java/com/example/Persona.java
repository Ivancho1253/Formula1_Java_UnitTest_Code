package com.example;

public class Persona {

    public String nombre;
    public String nacionalidad;

    public Persona(String nombre, String nacionalidad) {
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }



}