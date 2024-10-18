package com.example;
import java.util.ArrayList;

public class Equipo {
    
    private String nombre;
    private ArrayList <Piloto> pilotos;
    private ArrayList <Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;
    private SponsorContrato sponsorE;

    public Equipo(String nombre, ArrayList <Piloto> pilotos, ArrayList <Mecanico> mecanicos,
                Ingeniero ingenieroPrincipal, SponsorContrato sponsorE) {
        setNombre(nombre);
        setPilotos(pilotos);
        setMecanicos(mecanicos);
        setIngenieroPrincipal(ingenieroPrincipal);
        setSponsorE(sponsorE);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList <Piloto> getPilotos() {
        return pilotos;
    }   

    private void setPilotos(ArrayList <Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public ArrayList <Mecanico> getMecanicos() {
        return mecanicos;
    }

    private void setMecanicos(ArrayList <Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }

    public Ingeniero getIngenieroPrincipal() {
        return ingenieroPrincipal;
    }

    private void setIngenieroPrincipal(Ingeniero ingenieroPrincipal) {
        this.ingenieroPrincipal = ingenieroPrincipal;
    }

    public SponsorContrato getSponsorE() {
        return sponsorE;
    }

    private void setSponsorE(SponsorContrato sponsorE) {
        this.sponsorE = sponsorE;
    }
}
