package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class CarreraTest {
    
    @Test
    public void carrera_Test() {
        
        Circuito circuito = new Circuito ("Pachamama", 30, 15);

        ArrayList <Piloto> pilotos = new ArrayList<>();
        pilotos.add(new Piloto("Ramiro", "Argentino"));
        pilotos.add(new Piloto("Joaco", "Peruano"));
        pilotos.add(new Piloto("Pedro", "Colombiano"));

        Carrera carrera = new Carrera ("10/02/2025", circuito, pilotos);

        assertEquals("10/02/2025", carrera.getFecha());
        assertEquals("Pachamama", carrera.getCircuito().getNombre());
        assertEquals("Ramiro", carrera.getPilotos().get(0).getNombre());
        assertEquals("Joaco", carrera.getPilotos().get(1).getNombre());
        assertEquals("Pedro", carrera.getPilotos().get(2).getNombre());
    
    }

}
