package com.example;
import java.time.LocalDate;
import  java.util.ArrayList;
import java.util.List;

public class Circuito
            implements ISponsoreable
            { 

    private String nombre;
    private int longitud;
    private int vueltasCantidad;
    
    //LISTA QUE SE ALMACENARAN LOS SPONSORS
    private List <SponsorContrato> sponsorC = new ArrayList<>();


    private List <SponsorContrato> sponsorsHabilitados = new ArrayList<>();

    public Circuito(String nombre, int longitud, int vueltasCantidad) {
        setNombre(nombre);
        setLongitud(longitud);
        setVueltasCantidad(vueltasCantidad);
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

    //////////////   INTERFAZ   /////////////////

    @Override
    public List <SponsorContrato> getSponsors(){
        return sponsorC;
    }
   
    @Override
    public void agregarSponsor(SponsorContrato sponsorContrato){
        sponsorC.add(sponsorContrato);
    }

    public void agregarSponsor(Sponsor sponsor, String ubicacion, LocalDate fechaDesde){
        SponsorContrato sponsorContrato = new SponsorContrato(ubicacion, fechaDesde, null, sponsor);
        sponsorC.add(sponsorContrato);
    }
    
    @Override
    public void removerSponsor(Sponsor sponsor){
        sponsorC.removeIf(s -> s.getSponsor().equals(sponsor));
    }

    
    public void removerSponsor(String ubicacion){
        sponsorC.removeIf(s -> s.getUbicacion().equals(ubicacion));
    }

    //Se remueve el sponsor en dicha X ubicacion
    public void removerSponsor(Sponsor sponsor, String ubicacion){
        sponsorC.removeIf(s -> s.getUbicacion().equals(ubicacion) && s.getSponsor().equals(sponsor));
    }

    @Override
    public int sponsorHabilitados(){

        LocalDate fechaActual = LocalDate.of(2024,10,21);

        sponsorsHabilitados.clear();

        for (SponsorContrato sponsorContrato : sponsorC) {
            if (sponsorContrato.getFechaHasta() == null || sponsorContrato.getFechaHasta().isAfter(fechaActual)) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }
        return sponsorsHabilitados.size();
    }
}
