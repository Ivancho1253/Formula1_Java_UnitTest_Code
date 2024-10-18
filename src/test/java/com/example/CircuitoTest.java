package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircuitoTest {
    
    @Test
    public void circuito_test() {
        
        Sponsor sponsor = new Sponsor("Samsung");
        assertEquals("Samsung", sponsor.getNombre());

        SponsorContrato contratoSponsor = new SponsorContrato("Pantallas LED", "10/02/2025", "10/02/2026",sponsor);

        Circuito circuito = new Circuito("Pachamama", 30, 15, contratoSponsor);
    
        assertEquals("Pachamama", circuito.getNombre());
        assertEquals(30, circuito.getLongitud());
        assertEquals(15, circuito.getVueltasCantidad()); 
        assertEquals("Samsung", circuito.getSponsorC().getSponsor().getNombre());
        assertEquals("10/02/2025", circuito.getSponsorC().getFechaDesde());
        assertEquals("10/02/2026", circuito.getSponsorC().getFechaHasta());

    }
}
