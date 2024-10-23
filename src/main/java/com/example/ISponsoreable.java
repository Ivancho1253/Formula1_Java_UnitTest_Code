package com.example;
import java.util.List;
import java.time.LocalDate;

public interface ISponsoreable {
    
    //public SponsorContrato sponsorContrato;
    
    public List <SponsorContrato> getSponsors();
   
    public void agregarSponsor(SponsorContrato sponsorContrato);

    public void agregarSponsor(Sponsor sponsor, String ubicacion, LocalDate fechaDesde);

    public void removerSponsor(Sponsor sponsor);

    public void removerSponsor(String ubicacion);

    public void removerSponsor(Sponsor sponsor, String ubicacion);

    public int sponsorHabilitados();

}
