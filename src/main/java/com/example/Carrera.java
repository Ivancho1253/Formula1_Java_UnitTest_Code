package com.example;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Carrera {
    
    private LocalDate fecha;
    private Circuito circuito;
    private ArrayList <Piloto> pilotos;
    private List <Vuelta> vueltasCarrera = new ArrayList<>();

    public Carrera(LocalDate fecha, Circuito circuito, ArrayList <Piloto> pilotos, List <Vuelta> vueltasCarrera) {
        setFecha(fecha);
        setCircuito(circuito);
        setPilotos(pilotos);
        setVueltasCarrera(vueltasCarrera);
    }

    public LocalDate getFecha() {
        return fecha;
    }
    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Circuito getCircuito() {
        return circuito;
    }
    private void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }
    public ArrayList <Piloto> getPilotos() {
        return pilotos;
    }
    private void setPilotos(ArrayList <Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public List <Vuelta> getVueltasCarrera() {
        return vueltasCarrera;
    }
    private void setVueltasCarrera(List <Vuelta> vueltasCarrera) {
        this.vueltasCarrera = vueltasCarrera;
    }

    public static LocalDate fechaActual() {
        return LocalDate.now(); // Devuelve la fecha actual usando LocalDate
    }

}
