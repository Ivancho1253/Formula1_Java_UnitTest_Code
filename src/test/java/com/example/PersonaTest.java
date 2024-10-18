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

}
