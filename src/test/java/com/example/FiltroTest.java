package com.example;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FiltroTest {
    
    @Test
    public void filtro_pilotoNacionalidad_test(){

        Piloto piloto1 = new Piloto("Franco ", "Argentina","Ferrari");
        Piloto piloto2 = new Piloto("Ramiro", "Chile","Mereces Benz");
        Piloto piloto3 = new Piloto("Joaquin", "Argentina","McLaren");
        Piloto piloto4 = new Piloto("Jorge", "Argentina","RedBull");

        ArrayList <Piloto> pilotos = new ArrayList<>();

        pilotos.add(piloto1);
        pilotos.add(piloto2);
        pilotos.add(piloto3);
        pilotos.add(piloto4);

        // Filtrar por nacionalidad
        Filtro fPilotoNacionalidad = new Filtro();

        List <Piloto> pilotosFiltrados = fPilotoNacionalidad.filtroPilotosNacionalidad(pilotos, "Argentina");
        
        assertEquals(3, pilotosFiltrados.size());
    }

    @Test
    public void filtro_vueltas_circuito_test(){
        
        ArrayList <Piloto> pilotos = new ArrayList<>();
        Piloto piloto1 = new Piloto("Franco Colapinto", "Argentina", "Williams");
        pilotos.add(piloto1);

        Circuito circuito = new Circuito("Austin", 1234, 56); // nombre, longitud, cantidad de vueltas

        Equipo equipo = new Equipo("Williams", pilotos, null, null);

        Vuelta vuelta1 = new Vuelta (piloto1, equipo, circuito, 90.5); // 90.5 segundos en la vuelta
        Vuelta vuelta2 = new Vuelta (piloto1, equipo, circuito, 88.1); // 90.5 segundos en la vuelta
        Vuelta vuelta3 = new Vuelta (piloto1, equipo, circuito, 91.3); // 90.5 segundos en la vuelta
        
        ArrayList <Vuelta> vueltasCircuito = new ArrayList<>();
        vueltasCircuito.add(vuelta1);
        vueltasCircuito.add(vuelta2);
        vueltasCircuito.add(vuelta3);
        
        Filtro fVueltaCircuito = new Filtro();
        List <Vuelta> vueltasFiltradas = fVueltaCircuito.filtroVueltasCircuito(vueltasCircuito, circuito.getNombre());
        
        assertEquals(3, vueltasFiltradas.size());

    }

    @Test
    public void filtro_piloto_equipo_test(){
    
        ArrayList <Piloto> pilotos = new ArrayList<>();
        Piloto piloto1 = new Piloto("Juan ", "Argentina", "Williams");
        Piloto piloto2 = new Piloto("Franco", "Argentina", "Ferrari");
        Piloto piloto3 = new Piloto("Francisco", "Argentina", "McLaren");
        Piloto piloto4 = new Piloto("Nicolas", "Argentina", "Mercedes Benz");
        Piloto piloto5 = new Piloto("Luis", "Argentina", "Williams");

        pilotos.add(piloto1);
        pilotos.add(piloto2);
        pilotos.add(piloto3);
        pilotos.add(piloto4);
        pilotos.add(piloto5);

        // Filtrar por equipo
        Filtro fPilotoEquipo = new Filtro();
        List <Piloto> pilotosFiltrados = fPilotoEquipo.filtroPilotosEquipo(pilotos, "Williams");
        
        assertEquals(2, pilotosFiltrados.size());
    }

    @Test
    public void filtro_vueltas_rapidas_test(){

        ArrayList <Piloto> pilotos = new ArrayList<>();
        Piloto piloto1 = new Piloto("Franco Colapinto", "Argentina", "Williams");
        pilotos.add(piloto1);

        Circuito circuito = new Circuito("Austin", 1234, 56); // nombre, longitud, cantidad de vueltas

        Equipo equipo = new Equipo("Williams", pilotos, null, null);

        ArrayList <Vuelta> vueltas = new ArrayList<>();
        Vuelta vuelta1 = new Vuelta (piloto1, equipo, circuito, 90.5); // 90.5 segundos en la vuelta
        Vuelta vuelta2 = new Vuelta (piloto1, equipo, circuito, 88.1); // 90.5 segundos en la vuelta
        Vuelta vuelta3 = new Vuelta (piloto1, equipo, circuito, 91.3); // 90.5 segundos en la vuelta

        vueltas.add(vuelta1);
        vueltas.add(vuelta2);
        vueltas.add(vuelta3);

        //Filtrar por vueltas que sean mas rapidas que X tiempo
        Filtro fVueltasRapidas = new Filtro();
        
        List <Vuelta> vueltasFiltradas = fVueltasRapidas.filtroVueltasRapidas(vueltas, 91.2);

        assertEquals(2, vueltasFiltradas.size());
    }

    @Test
    public void filtrar_vueltas_circuito_test(){
        
        ArrayList <Circuito> circuitos = new ArrayList<>();

        Circuito circuito1 = new Circuito("Austin", 1234, 56);
        Circuito circuito2 = new Circuito("Suzuka", 1100, 56);
        Circuito circuito3 = new Circuito("Catalunya", 950, 56);
        Circuito circuito4 = new Circuito("Monaco", 2000, 56);

        circuitos.add(circuito1);
        circuitos.add(circuito2);
        circuitos.add(circuito3);  
        circuitos.add(circuito4);
        
        //Filtrar por circuito mas largo que X longitud

        Filtro fVueltaCircuito = new Filtro();
        List <Circuito> circuitosFiltrados = fVueltaCircuito.filtroCircuitoLongitud(circuitos, 1000);
        
        assertEquals(3, circuitosFiltrados.size());
        
    }
}
