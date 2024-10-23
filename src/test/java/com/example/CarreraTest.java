package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;

public class CarreraTest {
    
    @Test
    public void carrera_Test() {
        
        LocalDate fechaCarrera = LocalDate.of(2024,12,21);
        LocalDate fechaDesde = LocalDate.of(2024,10,21);
        LocalDate fechaHasta = LocalDate.of(2026,10,21);

        Sponsor sponsorC = new Sponsor("Globant");
        SponsorContrato contratoSponsorC = new SponsorContrato("Pantalla LED", fechaDesde, fechaHasta,sponsorC);

        Sponsor sponsorP1 = new Sponsor("Samsung");
        SponsorContrato contratoSponsorP1 = new SponsorContrato("Casco", fechaDesde, fechaHasta, sponsorP1);

        Sponsor SponsorP2 = new Sponsor("Apple");
        SponsorContrato contratoSponsorP2 = new SponsorContrato("Mono", fechaDesde, fechaHasta, SponsorP2);

        Sponsor sponsorP3 = new Sponsor("Huawei");
        SponsorContrato contratoSponsorP3 = new SponsorContrato("Casco", fechaDesde, fechaHasta, sponsorP3);

        Circuito circuito = new Circuito ("Pachamama", 30, 15);

        circuito.agregarSponsor(contratoSponsorC);


        ArrayList <Piloto> pilotos = new ArrayList<>();
        pilotos.add(new Piloto("Ramiro", "Argentino", "Ferrari"));
        pilotos.add(new Piloto("Joaco", "Peruano","Ferrari"));
        pilotos.add(new Piloto("Pedro", "Colombiano","Ferrari"));

        pilotos.get(0).agregarSponsor(contratoSponsorP1);
        pilotos.get(1).agregarSponsor(contratoSponsorP2);
        pilotos.get(2).agregarSponsor(contratoSponsorP3);

        Equipo equipo = new Equipo("Ferrari", pilotos, null, null);

        ArrayList <Vuelta> vueltas = new ArrayList<>();
        
        Vuelta vuelta1 = new Vuelta(pilotos.get(0), equipo, circuito, 90.5);
        Vuelta vuelta2 = new Vuelta(pilotos.get(1), equipo, circuito, 88.1);
        Vuelta vuelta3 = new Vuelta(pilotos.get(2), equipo, circuito, 91.3);

        vueltas.add(vuelta1);
        vueltas.add(vuelta2);
        vueltas.add(vuelta3);

        Carrera carrera = new Carrera (fechaCarrera, circuito, pilotos, vueltas);

        assertEquals(fechaCarrera, carrera.getFecha());
        assertEquals("Pachamama", carrera.getCircuito().getNombre());
        
        assertEquals("Samsung", pilotos.get(0).getSponsors().get(0).getSponsor().getNombre());
        
        assertEquals(90.5, carrera.getVueltasCarrera().get(0).getTiempo());
        assertEquals(88.1, carrera.getVueltasCarrera().get(1).getTiempo());
        assertEquals(91.3, carrera.getVueltasCarrera().get(2).getTiempo());
    }

    @Test
    void ejemplo_test() {

        // Crear 10 pilotos usando un bucle for
        for (int i = 1; i <= 10; i++) {
            Piloto piloto = new Piloto("Piloto" + i, "Argentino", "Ferrari" + i);
            Equipo equipo = new Equipo("Equipo" + i, null, null, null);
            
            Circuito circuito = new Circuito("UCP");

            Carrera carrera = new Carrera(circuito);

            // Insertar 56 vueltas para cada piloto
            for (int j = 1; j <= 56; j++) {
                double tiempo = i * j * 1000;
		        int numeroVuelta = j;
                Vuelta vuelta = new Vuelta(piloto, equipo, tiempo, numeroVuelta);
                carrera.agregar(vuelta);
            }

            carrera.agregar(piloto);
        }

	    //Realizar test para responder preguntas…

}
}
