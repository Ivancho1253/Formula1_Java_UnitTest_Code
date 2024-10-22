package com.example;
import java.util.ArrayList;
import java.util.List;

public class Equipo
            implements ISponsoreable {
    
    private String nombre;
    private ArrayList <Piloto> pilotos;
    private ArrayList <Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;

    //Lista donde se almacenan todos los sponsors que tiene el equipo.
    private List <SponsorContrato> sponsorE;

    private List <SponsorContrato> sponsorsHabilitados = new ArrayList<>();

    public Equipo(){
        this.sponsorE = new ArrayList<>();
    }

    public Equipo(String nombre, ArrayList <Piloto> pilotos, ArrayList <Mecanico> mecanicos,
                Ingeniero ingenieroPrincipal){
        setNombre(nombre);
        setPilotos(pilotos);
        setMecanicos(mecanicos);
        setIngenieroPrincipal(ingenieroPrincipal);

        this.sponsorE = sponsorE != null ? sponsorE : new ArrayList<>();
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

    public List <SponsorContrato> getSponsorE() {
        return sponsorE;
    }

    public void agregarSponsorE (SponsorContrato sponsorContrato) {
        sponsorE.add(sponsorContrato);
    }

    //////////////   INTERFAZ   /////////////////

    @Override
    public List <SponsorContrato> getSponsors(){
        return sponsorE;
    }

    @Override
    public void agregarSponsor(SponsorContrato sponsorContrato){
        sponsorE.add(sponsorContrato);
    }

    @Override
    public void removerSponsor(){
        sponsorE.clear();
    }

    @Override
    public int sponsorHabilitados(){

        for (SponsorContrato sponsorContrato : sponsorE) {
            if (sponsorContrato.getFechaHasta() != null) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }

        return sponsorsHabilitados.size();

    }


}
