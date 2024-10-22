package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class CarreraTest {
    
    @Test
    public void carrera_Test() {
        
        Sponsor sponsorC = new Sponsor("Globant");
        SponsorContrato contratoSponsorC = new SponsorContrato("Pantalla LED", "10/02/2025", "10/02/2026",sponsorC);

        Sponsor sponsorP1 = new Sponsor("Samsung");
        SponsorContrato contratoSponsorP1 = new SponsorContrato("Casco", "10/02/2025", "10/02/2026",sponsorP1);

        Sponsor SponsorP2 = new Sponsor("Apple");
        SponsorContrato contratoSponsorP2 = new SponsorContrato("Mono", "10/02/2025", "10/02/2026",SponsorP2);

        Sponsor sponsorP3 = new Sponsor("Huawei");
        SponsorContrato contratoSponsorP3 = new SponsorContrato("Casco", "10/02/2025", "10/02/2026",sponsorP3);

        Circuito circuito = new Circuito ("Pachamama", 30, 15);

        circuito.agregarSponsor(contratoSponsorC);

        ArrayList <Piloto> pilotos = new ArrayList<>();
        pilotos.add(new Piloto("Ramiro", "Argentino"));
        pilotos.add(new Piloto("Joaco", "Peruano"));
        pilotos.add(new Piloto("Pedro", "Colombiano"));

        pilotos.get(0).agregarSponsor(contratoSponsorP1);
        pilotos.get(1).agregarSponsor(contratoSponsorP2);
        pilotos.get(2).agregarSponsor(contratoSponsorP3);

        Carrera carrera = new Carrera ("10/02/2025", circuito, pilotos);

        assertEquals("10/02/2025", carrera.getFecha());
        assertEquals("Pachamama", carrera.getCircuito().getNombre());
        
        assertEquals("Samsung", pilotos.get(0).getSponsors().get(0).getSponsor().getNombre());
    
    }
}
