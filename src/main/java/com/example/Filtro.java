package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Filtro {

    public Filtro() {
    }

    //Filtro 1 = ¿Cuántos pilotos tienen una nacionalidad específica?
    public List<Piloto> filtroPilotosNacionalidad(ArrayList<Piloto> pilotos, String nacionalidad){
        return pilotos.stream()
                    .filter(piloto -> piloto.getNacionalidad().equals(nacionalidad))
                     .collect(Collectors.toList());
    }
    
    //Filtro 2 = ¿Cuántas vueltas fueron registradas en un circuito específico?
    public List <Vuelta> filtroVueltasCircuito(ArrayList <Vuelta> vueltas, String circuito){
        return vueltas.stream()
                    .filter(vuelta -> vuelta.getCircuito().getNombre().equals(circuito))
                    .collect(Collectors.toList());
    }

    //Filtro 3 = ¿Cuántos pilotos de un equipo específico participaron en una carrera?

    public List <Piloto> filtroPilotosEquipo(ArrayList <Piloto> pilotos, String equipo){
        return pilotos.stream()
                    .filter(piloto -> piloto.getEscuderia().equals(equipo))
                    .collect(Collectors.toList());
    }

    //Filtro 4 = ¿Cuántas vueltas fueron más rápidas que un tiempo específico?

    public List <Vuelta> filtroVueltasRapidas(ArrayList <Vuelta> vueltas, double tiempo){
        return vueltas.stream()
                    .filter(vuelta -> vuelta.getTiempo() < (tiempo))
                    .collect(Collectors.toList()); 
    }               

    //Filtro 5 = ¿Cuántos circuitos tienen una longitud mayor a un valor determinado?

    public List <Circuito> filtroCircuitoLongitud(ArrayList <Circuito> circuitos, int longitud){
        return circuitos.stream()
                    .filter(circuito -> circuito.getLongitud() > (longitud))
                    .collect(Collectors.toList());
    }
}
