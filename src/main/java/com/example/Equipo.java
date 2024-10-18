package com.example;
import java.util.ArrayList;

public class Equipo {
    
    private String nombre;
    private ArrayList <Piloto> pilotos;
    private ArrayList <Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;

    public Equipo(String nombre, ArrayList <Piloto> pilotos, ArrayList <Mecanico> mecanicos, Ingeniero ingenieroPrincipal) {
        setNombre(nombre);
        setPilotos(pilotos);
        setMecanicos(mecanicos);
        setIngenieroPrincipal(ingenieroPrincipal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList <Piloto> getPilotos() {
        return pilotos;
    }   

    public void setPilotos(ArrayList <Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public ArrayList <Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(ArrayList <Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public Ingeniero getIngenieroPrincipal() {
        return ingenieroPrincipal;
    }

    public void setIngenieroPrincipal(Ingeniero ingenieroPrincipal) {
        this.ingenieroPrincipal = ingenieroPrincipal;
    }
}
