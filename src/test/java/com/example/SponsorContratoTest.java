package com.example;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SponsorContratoTest {

    @Test
    public void sponsorContrato_test() {

        LocalDate fechaDesde = LocalDate.of(2024,10,21);
        LocalDate fechaHasta = LocalDate.of(2026,10,21);

        Sponsor sponsor = new Sponsor("Apple");
        assertEquals("Apple", sponsor.getNombre());

        SponsorContrato contratoSponsor = new SponsorContrato("Casco", fechaDesde, fechaHasta,sponsor);
        
        assertEquals(fechaDesde, contratoSponsor.getFechaDesde());
        assertEquals(fechaHasta, contratoSponsor.getFechaHasta());
        assertEquals("Apple", contratoSponsor.getSponsor().getNombre());

    }

}