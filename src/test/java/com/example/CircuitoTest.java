package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircuitoTest {
    
    @Test
    public void circuito_test() {
        
        Circuito circuito = new Circuito("Pachamama", 30, 15);
    
        assertEquals("Pachamama", circuito.getNombre());
        assertEquals(30, circuito.getLongitud());
        assertEquals(15, circuito.getVueltasCantidad()); 
    }
}
