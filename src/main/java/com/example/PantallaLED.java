package com.example;

public class PantallaLED {
    
    private INombreParaLED persona;

    public PantallaLED (INombreParaLED persona){

        setPersona(persona);
    }

    public INombreParaLED getPersona(){
        return persona;
    }

    private void setPersona(INombreParaLED persona){
        this.persona = persona;
    }

}
