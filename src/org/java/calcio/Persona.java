package org.java.calcio;

import java.time.LocalDate;

public class Persona {
    private String name;
    private int eta;

    //Costruttori------------------------------------


    public Persona(String name, int eta) {
        this.name = name;
        this.eta = eta;
    }

    //Getter--------------------------------------

    public String getName() {
        return name;
    }

    public int getEta() {
        return eta;
    }

    //Metodi----------------------------------


    @Override
    public String toString() {
        return "{" +
                "name: " + name + " | " +
                "eta: " + eta + " | ";
    }
}
