package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class VueltaTest {
    
    @Test
    public void registrar_vuelta_del_piloto_en_circuito(){
        
        ArrayList <Piloto> pilotos = new ArrayList<>();
        Piloto piloto1 = new Piloto("Franco Colapinto", "Argentina","Wiliams");
        pilotos.add(piloto1);

        Circuito circuito = new Circuito("Austin", 1234, 56); // nombre, longitud, cantidad de vueltas

        Equipo equipo = new Equipo("Williams", pilotos, null, null);

        Vuelta vuelta1 = new Vuelta (piloto1, equipo, circuito, 90.5); // 90.5 segundos en la vuelta
        Vuelta vuelta2 = new Vuelta (piloto1, equipo, circuito, 88.1); // 90.5 segundos en la vuelta
        Vuelta vuelta3 = new Vuelta (piloto1, equipo, circuito, 91.3); // 90.5 segundos en la vuelta
        
        // Verificar que la vuelta se haya registrado correctamente
        assertEquals(90.5, vuelta1.getTiempo());
        assertEquals(88.1, vuelta2.getTiempo());
        assertEquals(91.3, vuelta3.getTiempo());
       
    }
}
