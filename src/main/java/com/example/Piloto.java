package com.example;
import java.util.ArrayList;
import java.util.List;

public class Piloto 
            extends Persona
            implements ISponsoreable{
        
    private List <SponsorContrato> sponsorP = new ArrayList<>();
    private List <SponsorContrato> sponsorsHabilitados = new ArrayList<>();

    public Piloto(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);
    }

    //////////////   INTERFAZ   /////////////////

    @Override
    public List <SponsorContrato> getSponsors(){
        return sponsorP;
    }
   
    @Override
    public void agregarSponsor(SponsorContrato sponsorContrato){
        sponsorP.add(sponsorContrato);
    }

    @Override
    public void removerSponsor(){
        sponsorP.clear();
    }

    @Override
    public int sponsorHabilitados(){

        for (SponsorContrato sponsorContrato : sponsorP) {
            if (sponsorContrato.getFechaHasta() != null) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }

        return sponsorsHabilitados.size();

    }
    
}
