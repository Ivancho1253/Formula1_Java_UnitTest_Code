package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class EquipoTest {
    
    @Test
    public void equipo_test() {

        Sponsor sponsorP = new Sponsor("Samsung");
        SponsorContrato contratoSponsorP = new SponsorContrato("Casco", "10/02/2025", "10/02/2026",sponsorP);
        
        Sponsor sponsorE = new Sponsor("Pirelli");
        SponsorContrato contratoSponsorE = new SponsorContrato("Casco", "10/02/2025", "10/02/2026",sponsorE);

        ArrayList<Piloto> pilotos = new ArrayList<>();
        pilotos.add(new Piloto("Ramiro", "Argentino", contratoSponsorP));

        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        mecanicos.add(new Mecanico("Rodrigo", "Argentino"));

        Ingeniero ingeniero = new Ingeniero("Joaco", "Peruano");

        Equipo equipo = new Equipo("Ferrari", pilotos, mecanicos, ingeniero, contratoSponsorE);

        assertEquals("Ferrari", equipo.getNombre());
        assertEquals(pilotos, equipo.getPilotos());
        assertEquals(mecanicos, equipo.getMecanicos());
        assertEquals(ingeniero, equipo.getIngenieroPrincipal());
        assertEquals("Pirelli", equipo.getSponsorE().getSponsor().getNombre());

    }
}