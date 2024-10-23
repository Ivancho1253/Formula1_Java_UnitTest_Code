package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class CircuitoTest {
    
    @Test
    public void circuito_test() {
        
        LocalDate fechaDesde = LocalDate.of(2024,10,21);
        LocalDate fechaHasta = LocalDate.of(2026,10,21);

        Sponsor sponsor = new Sponsor("Samsung");
        Sponsor sponsor2 = new Sponsor("Pirelli");

        SponsorContrato contratoSponsor = new SponsorContrato("Pantallas LED", fechaDesde, fechaHasta,sponsor);
        SponsorContrato contratoSponsor2 = new SponsorContrato("Entrada", fechaDesde, fechaHasta,sponsor2);

        Circuito circuito = new Circuito("Pachamama", 30, 15);
        
        circuito.agregarSponsor(contratoSponsor);
        circuito.agregarSponsor(contratoSponsor2);

        assertEquals(2, circuito.sponsorHabilitados());

        assertEquals("Pachamama", circuito.getNombre());
        assertEquals(30, circuito.getLongitud());
        assertEquals(15, circuito.getVueltasCantidad()); 
        assertEquals("Samsung", circuito.getSponsors().get(0).getSponsor().getNombre());
        assertEquals("Pirelli", circuito.getSponsors().get(1).getSponsor().getNombre());

        circuito.removerSponsor(sponsor, "Pantallas LED");
        assertEquals(1, circuito.getSponsors().size());
        assertEquals(1, circuito.sponsorHabilitados());

    }
}
