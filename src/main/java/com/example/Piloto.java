package com.example;

public class Piloto 
            extends Persona
            implements ISponsoreable{
    
    private SponsorContrato sponsorP;
        
    public Piloto(String nombre, String nacionalidad, SponsorContrato sponsorP) {
        super(nombre, nacionalidad);
        setSponsorP(sponsorP);
    }

    public SponsorContrato getSponsorP() {
        return sponsorP;
    }

    private void setSponsorP(SponsorContrato sponsorP) {
        this.sponsorP = sponsorP;
    }
}
