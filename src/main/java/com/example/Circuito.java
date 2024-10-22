package com.example;
import  java.util.ArrayList;
import java.util.List;

public class Circuito
            implements ISponsoreable{
    
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

    @Override
    public void removerSponsor(){
        sponsorC.clear();
    }

    @Override
    public int sponsorHabilitados(){

        for (SponsorContrato sponsorContrato : sponsorC) {
            if (sponsorContrato.getFechaHasta() != null) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }

        return sponsorsHabilitados.size();

    }


    
}
