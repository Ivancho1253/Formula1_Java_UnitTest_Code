package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PilotoTest {

    @Test
    public void piloto_test() {

        Piloto piloto = new Piloto("Ramiro", "Argentino");


        Sponsor sponsor = new Sponsor("Apple");
        assertEquals("Apple", sponsor.getNombre());

        SponsorContrato contratoSponsor = new SponsorContrato("Casco", "10/02/2025", "10/02/2026",sponsor);
        
        piloto.agregarSponsor(contratoSponsor);

        assertEquals("10/02/2025", contratoSponsor.getFechaDesde());
        assertEquals("10/02/2026", contratoSponsor.getFechaHasta());
        assertEquals("Apple", piloto.getSponsors().get(0).getSponsor().getNombre());
    }

    @Test
    public void piloto_test_removerSponsor() {

        Piloto piloto = new Piloto("Ramiro", "Argentino");

        Sponsor sponsor = new Sponsor("Apple");
        assertEquals("Apple", sponsor.getNombre());

        SponsorContrato contratoSponsor = new SponsorContrato("Casco", "10/02/2025", "10/02/2026",sponsor);
        piloto.agregarSponsor(contratoSponsor);

        assertEquals(1, piloto.sponsorHabilitados());

        assertEquals("10/02/2025", contratoSponsor.getFechaDesde());
        assertEquals("10/02/2026", contratoSponsor.getFechaHasta());
        assertEquals("Apple", piloto.getSponsors().get(0).getSponsor().getNombre());

        piloto.removerSponsor();

        assertEquals(0, piloto.getSponsors().size());

 
    }

}
