package com.example;

public class Circuito {
    
    private String nombre;
    private int longitud;
    private int vueltasCantidad;
    private SponsorContrato sponsorC;

    public Circuito(String nombre, int longitud, int vueltasCantidad,
                    SponsorContrato sponsorC) {
        setNombre(nombre);
        setLongitud(longitud);
        setVueltasCantidad(vueltasCantidad);
        setSponsorC(sponsorC);
    }

    public String getNombre() {
        return nombre;
    }    

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    private void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getVueltasCantidad() {
        return vueltasCantidad;
    }

    private void setVueltasCantidad(int vueltasCantidad) {
        this.vueltasCantidad = vueltasCantidad;
    }

    public SponsorContrato getSponsorC() {
        return sponsorC;
    }

    private void setSponsorC(SponsorContrato sponsorC) {
        this.sponsorC = sponsorC;
    }
}
