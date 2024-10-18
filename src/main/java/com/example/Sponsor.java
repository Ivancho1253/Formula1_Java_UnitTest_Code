package com.example;

public class Sponsor {
    
    private String nombre;

    public Sponsor(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
