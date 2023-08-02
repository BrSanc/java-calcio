package org.java.calcio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Giocatore extends Persona{

    private String ruolo;

    public Giocatore(String name, int eta, String ruolo) {
        super(name, eta);
        this.ruolo = ruolo;
    }


    //Metodi----------------------------


    @Override
    public String toString() {
        return "Giocatore: " + super.toString() + "Ruolo: " + ruolo +"}";
    }
}
