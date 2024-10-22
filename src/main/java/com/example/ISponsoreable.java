package com.example;
import java.util.List;

public interface ISponsoreable {
    
    //public SponsorContrato sponsorContrato;
    
    public List <SponsorContrato> getSponsors();
   
    public void agregarSponsor(SponsorContrato sponsorContrato);

    public void removerSponsor();

    public int sponsorHabilitados();

}
