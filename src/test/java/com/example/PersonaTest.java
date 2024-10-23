package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {
    
    @Test
    public void nombre_test() {
        
        Persona persona = new Persona("Ivan", "Argentina");
        assertEquals("Ivan", persona.getNombre());
        assertEquals("Argentina", persona.getNacionalidad());
    }

    @Test
    public void pantalla_led_piloto() {

        INombreParaLED  piloto = new Piloto("Franco Colapinto", "Argentino", "Williams");
        var pantallaLED = new PantallaLED (piloto);
        assertEquals("Franco Colapinto", pantallaLED.getPersona().getNombreParaLed());

    }

    @Test
    void pantalla_led_mecanico() {
        INombreParaLED  mecanico = new Mecanico("Mecanico 1", "Argentino");
        var pantallaLED = new PantallaLED(mecanico);
        assertEquals("Mecanico 1", pantallaLED.getPersona().getNombreParaLed());
    }

    @Test
    void pantalla_led_sponsor() {
        INombreParaLED  sponsor = new Sponsor("Bizarrap");
        var pantallaLED = new PantallaLED(sponsor);
        assertEquals("Bizarrap", pantallaLED.getPersona().getNombreParaLed());
    }

}
