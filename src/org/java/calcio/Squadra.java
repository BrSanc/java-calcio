package org.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
    private static List<Persona> squadra;

    //costruttori-------------------------------------

    public Squadra(String[] arrayString1, String[] arrayString2) {
        squadra = new ArrayList<>();
            Allenatore allenatore = new Allenatore(StaticRandom.nomeCasuale(arrayString1),StaticRandom.etaRandom(),"Defensiva");
            squadra.add(allenatore);
        for (int i = 0; i < 11; i++) {
            Giocatore giocatore = new Giocatore(StaticRandom.nomeCasuale(arrayString1),StaticRandom.etaRandom(),StaticRandom.ruoloCasuale(arrayString2));
            squadra.add(giocatore);
        }

    }


    //Getter------------------------------------

    //Metodi--------------------------------------

    public static void stampaNomi(){
        for (int i = 0; i < squadra.size(); i++) {
            System.out.println(squadra.get(i));
        }
    }
    @Override
    public String toString() {
        return "Squadra{" +
                "squadra=" + squadra +
                '}';
    }
}
