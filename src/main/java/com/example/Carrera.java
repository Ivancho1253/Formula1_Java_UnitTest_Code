package com.example;
import java.util.ArrayList;

public class Carrera {
    
    private String fecha;
    private Circuito circuito;
    private ArrayList <Piloto> pilotos;

    public Carrera(String fecha, Circuito circuito, ArrayList <Piloto> pilotos) {
        setFecha(fecha);
        setCircuito(circuito);
        setPilotos(pilotos);
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Circuito getCircuito() {
        return circuito;
    }
    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }
    public ArrayList <Piloto> getPilotos() {
        return pilotos;
    }
    public void setPilotos(ArrayList <Piloto> pilotos) {
        this.pilotos = pilotos;
    }
}
