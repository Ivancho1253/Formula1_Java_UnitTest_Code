package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircuitoTest {
    
    @Test
    public void circuito_test() {
        
        Sponsor sponsor = new Sponsor("Samsung");
        Sponsor sponsor2 = new Sponsor("Pirelli");

        SponsorContrato contratoSponsor = new SponsorContrato("Pantallas LED", "10/02/2025", "10/02/2026",sponsor);
        SponsorContrato contratoSponsor2 = new SponsorContrato("Entrada", "10/02/2025", "10/02/2029",sponsor2);

        Circuito circuito = new Circuito("Pachamama", 30, 15);
        
        circuito.agregarSponsor(contratoSponsor);
        circuito.agregarSponsor(contratoSponsor2);

        assertEquals(2, circuito.sponsorHabilitados());

        assertEquals("Pachamama", circuito.getNombre());
        assertEquals(30, circuito.getLongitud());
        assertEquals(15, circuito.getVueltasCantidad()); 
        assertEquals("Samsung", circuito.getSponsors().get(0).getSponsor().getNombre());
        assertEquals("Pirelli", circuito.getSponsors().get(1).getSponsor().getNombre());

        circuito.removerSponsor();
        assertEquals(0, circuito.getSponsors().size());
    }
}
