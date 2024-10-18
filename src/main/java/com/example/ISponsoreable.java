package com.example;

public interface ISponsoreable {
    
    //public SponsorContrato sponsorContrato;
    
    public void getSponsors();

    public void agregarSponsor(SponsorContrato sponsorContrato);

    public void removerSponsor(Sponsor sponsor);

    public void sponsorHabilitados();

}
