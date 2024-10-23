package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.time.LocalDate;

public class EquipoTest {
    
    @Test
    public void equipo_test() {

        LocalDate fechaDesde = LocalDate.of(2024,10,21);
        LocalDate fechaHasta = LocalDate.of(2026,10,21);

        Sponsor sponsorP = new Sponsor("Samsung");
        SponsorContrato contratoSponsorP = new SponsorContrato("Casco", fechaDesde, fechaHasta,sponsorP);
        
        Sponsor sponsorE = new Sponsor("Pirelli");
        SponsorContrato contratoSponsorE = new SponsorContrato("Mono", fechaDesde, fechaHasta,sponsorE);
        
        ArrayList<Piloto> pilotos = new ArrayList<>();
        Piloto piloto = new Piloto("Ramiro", "Argentino", "Williams");
        pilotos.add(piloto);
        pilotos.get(0).agregarSponsor(contratoSponsorP);

        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        mecanicos.add(new Mecanico("Rodrigo", "Argentino"));

        Ingeniero ingeniero = new Ingeniero("Joaco", "Peruano");

        Equipo equipo = new Equipo("Ferrari", pilotos, mecanicos, ingeniero);

        equipo.agregarSponsor(contratoSponsorE);

        assertEquals(1, equipo.sponsorHabilitados());

        assertEquals("Ferrari", equipo.getNombre());
        assertEquals(pilotos, equipo.getPilotos());
        assertEquals(mecanicos, equipo.getMecanicos());
        assertEquals(ingeniero, equipo.getIngenieroPrincipal());
        assertEquals("Pirelli", equipo.getSponsors().get(0).getSponsor().getNombre());
        
        equipo.removerSponsor(sponsorE, "Casco");
        //No se elimina nada, debido que el equipo no tiene sponsors en el casco
        assertEquals(1, equipo.sponsorHabilitados());

        piloto.removerSponsor(sponsorP, "Casco");
        //Se elimina el sponsor del casco
        assertEquals(0, equipo.getPilotos().get(0).getSponsors().size());

    }
}