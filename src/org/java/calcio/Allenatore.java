package org.java.calcio;

import java.time.LocalDate;

public class Allenatore extends Persona{

    private String strategia;

    public Allenatore(String name, int eta, String strategia) {
        super(name, eta);
        this.strategia = strategia;
    }


    //Metodi----------------------------


    @Override
    public String toString() {
        return "Allenatore: " + super.toString() + "Strategia: " + strategia +"}";
    }
}
