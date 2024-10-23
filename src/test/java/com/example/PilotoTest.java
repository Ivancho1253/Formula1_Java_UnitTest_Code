package com.example;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PilotoTest {

    @Test
    public void piloto_test() {

        LocalDate fechaDesde = LocalDate.of(2024,10,21);
        LocalDate fechaHasta = LocalDate.of(2026,10,21);

        Piloto piloto = new Piloto("Ramiro", "Argentino","Williams");

        Sponsor sponsor = new Sponsor("Apple");
        assertEquals("Apple", sponsor.getNombre());

        SponsorContrato contratoSponsor = new SponsorContrato("Casco", fechaDesde, fechaHasta,sponsor);
        
        piloto.agregarSponsor(contratoSponsor);

        assertEquals(fechaDesde, contratoSponsor.getFechaDesde());
        assertEquals(fechaHasta, contratoSponsor.getFechaHasta());
        assertEquals("Apple", piloto.getSponsors().get(0).getSponsor().getNombre());
    }

    @Test
    public void piloto_test_removerSponsor() {
        
        LocalDate fechaDesde = LocalDate.of(2024,10,21);
        LocalDate fechaHasta = LocalDate.of(2026,10,21);

        Piloto piloto = new Piloto("Ramiro", "Argentino","Williams");

        Sponsor sponsor = new Sponsor("Apple");
        assertEquals("Apple", sponsor.getNombre());

        SponsorContrato contratoSponsor = new SponsorContrato("Casco", fechaDesde, fechaHasta,sponsor);
        piloto.agregarSponsor(contratoSponsor);

        assertEquals(1, piloto.sponsorHabilitados());

        assertEquals(fechaDesde, contratoSponsor.getFechaDesde());
        assertEquals(fechaHasta, contratoSponsor.getFechaHasta());
        assertEquals("Apple", piloto.getSponsors().get(0).getSponsor().getNombre());

        piloto.removerSponsor(sponsor, "Casco");

        assertEquals(0, piloto.getSponsors().size());
 
    }

}
