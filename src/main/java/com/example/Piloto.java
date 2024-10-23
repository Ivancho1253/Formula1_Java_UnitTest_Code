package com.example;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Piloto 
            extends Persona
            implements ISponsoreable
            {
    
    private String escuderia;
    private List <SponsorContrato> sponsorP = new ArrayList<>();
    private List <SponsorContrato> sponsorsHabilitados = new ArrayList<>();

    public Piloto(String nombre, String nacionalidad, String escuderia) {
        super(nombre, nacionalidad);
        setEscuderia(escuderia);
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

    public void agregarSponsor(Sponsor sponsor, String ubicacion, LocalDate fechaDesde){
        SponsorContrato sponsorContrato = new SponsorContrato(ubicacion, fechaDesde, null, sponsor);
        sponsorP.add(sponsorContrato);
    }
    
    @Override
    public void removerSponsor(Sponsor sponsor){
        sponsorP.removeIf(s -> s.getSponsor().equals(sponsor));
    }

    //Se remueve el sponsor en dicha X ubicacion
    public void removerSponsor(String ubicacion){
        sponsorP.removeIf(s -> s.getUbicacion().equals(ubicacion));
    }

    //Se remueve el sponsor en dicha X ubicacion
    public void removerSponsor(Sponsor sponsor, String ubicacion){
        sponsorP.removeIf(s -> s.getUbicacion().equals(ubicacion) && s.getSponsor().equals(sponsor));
    }

    @Override
    public int sponsorHabilitados(){

        LocalDate fechaActual = LocalDate.of(2024,10,21);

        sponsorsHabilitados.clear();

        for (SponsorContrato sponsorContrato : sponsorP) {
            if (sponsorContrato.getFechaHasta() == null || sponsorContrato.getFechaHasta().isAfter(fechaActual)) {
                sponsorsHabilitados.add(sponsorContrato);
            }
        }
        return sponsorsHabilitados.size();
    }
    
    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

}
