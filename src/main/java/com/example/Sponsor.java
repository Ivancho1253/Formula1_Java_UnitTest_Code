package com.example;

public class Sponsor
        implements INombreParaLED{
    
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
    
    //agrego metodo de interfaz
    
    @Override
    public String getNombreParaLed(){
        return nombre;
    }
}
