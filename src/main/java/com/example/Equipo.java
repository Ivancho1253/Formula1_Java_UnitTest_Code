package com.example;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Equipo
            implements ISponsoreable {
    
    private String nombre;
    private ArrayList <Piloto> pilotos;
    private ArrayList <Mecanico> mecanicos;
    private Ingeniero ingenieroPrincipal;

    //Lista donde se almacenan todos los sponsors que tiene el equipo.
    private List <SponsorContrato> sponsorE = new ArrayList<>();

    private List <SponsorContrato> sponsorsHabilitados = new ArrayList<>();

    public Equipo(String nombre, ArrayList <Piloto> pilotos, ArrayList <Mecanico> mecanicos,
                Ingeniero ingenieroPrincipal){
        setNombre(nombre);
        setPilotos(pilotos);
        setMecanicos(mecanicos);
        setIngenieroPrincipal(ingenieroPrincipal);
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

    //////////////   INTERFAZ   /////////////////

    @Override
    public List <SponsorContrato> getSponsors(){
        return sponsorE;
    }
   
    @Override
    public void agregarSponsor(SponsorContrato sponsorContrato){
        sponsorE.add(sponsorContrato);
    }

    public void agregarSponsor(Sponsor sponsor, String ubicacion, LocalDate fechaDesde){
        SponsorContrato sponsorContrato = new SponsorContrato(ubicacion, fechaDesde, null, sponsor);
        sponsorE.add(sponsorContrato);
    }
    
    @Override
    public void removerSponsor(Sponsor sponsor){
        sponsorE.removeIf(s -> s.getSponsor().equals(sponsor));
    }

    //Se remueve el sponsor en dicha X ubicacion
    public void removerSponsor(String ubicacion){
        sponsorE.removeIf(s -> s.getUbicacion().equals(ubicacion));
    }

    //Se remueve el sponsor en dicha X ubicacion
    public void removerSponsor(Sponsor sponsor, String ubicacion){
        sponsorE.removeIf(s -> s.getUbicacion().equals(ubicacion) && s.getSponsor().equals(sponsor));
    }

    @Override
    public int sponsorHabilitados(){

        LocalDate fechaActual = LocalDate.of(2024,10,21);

        sponsorsHabilitados.clear();

        for (SponsorContrato sponsorContrato : sponsorE) {
            if (sponsorContrato.getFechaHasta() == null || sponsorContrato.getFechaHasta().isAfter(fechaActual)) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }
        return sponsorsHabilitados.size();
    }
    
}
