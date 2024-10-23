package com.example;

public class Vuelta {
    
    private Piloto piloto;
    private Circuito circuito;
    private Equipo equipo;
    private double tiempo;

    public Vuelta(Piloto piloto, Equipo equipo, Circuito circuito, double tiempo) {
        setPiloto(piloto);
        setCircuito(circuito);
        setEquipo(equipo);
        setTiempo(tiempo);
    }

    public Piloto getPiloto() {
        return piloto;
    }

    private void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    private void setCircuito(Circuito circuito){
        this.circuito = circuito;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    private void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public double getTiempo() {
        return tiempo;
    }

    private void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }


}
