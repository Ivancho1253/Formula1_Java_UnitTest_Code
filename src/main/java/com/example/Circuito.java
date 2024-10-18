package com.example;

public class Circuito {
    
    private String nombre;
    private int longitud;
    private int vueltasCantidad;

    public Circuito(String nombre, int longitud, int vueltasCantidad) {
        setNombre(nombre);
        setLongitud(longitud);
        setVueltasCantidad(vueltasCantidad);
    }

    public String getNombre() {
        return nombre;
    }    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getVueltasCantidad() {
        return vueltasCantidad;
    }

    public void setVueltasCantidad(int vueltasCantidad) {
        this.vueltasCantidad = vueltasCantidad;
    }
}
