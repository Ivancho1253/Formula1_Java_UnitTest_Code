package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PilotoTest {

    @Test
    public void piloto_test() {

        Sponsor sponsor = new Sponsor("Apple");
        assertEquals("Apple", sponsor.getNombre());

        SponsorContrato contratoSponsor = new SponsorContrato("Casco", "10/02/2025", "10/02/2026",sponsor);
        
        assertEquals("10/02/2025", contratoSponsor.getFechaDesde());
        assertEquals("10/02/2026", contratoSponsor.getFechaHasta());
        assertEquals("Apple", contratoSponsor.getSponsor().getNombre());
    }
}
