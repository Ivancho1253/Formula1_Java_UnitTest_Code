package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class EquipoTest {
    
    @Test
    public void equipo_test() {
        
        ArrayList<Piloto> pilotos = new ArrayList<>();
        pilotos.add(new Piloto("Ramiro", "Argentino"));

        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        mecanicos.add(new Mecanico("Rodrigo", "Argentino"));

        Ingeniero ingeniero = new Ingeniero("Joaco", "Peruano");

        Equipo equipo = new Equipo("Ferrari", pilotos, mecanicos, ingeniero);

        assertEquals("Ferrari", equipo.getNombre());
        assertEquals(pilotos, equipo.getPilotos());
        assertEquals(mecanicos, equipo.getMecanicos());
        assertEquals(ingeniero, equipo.getIngenieroPrincipal());
    }
}