package org.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
    private static List<Persona> squadra;
    private String nomeSquadra;

    private String nomeGiocatore;


    //costruttori-------------------------------------

    public Squadra(String nomeSquadra, String[] nomePersona, String[] ruoliGiocatore, String[] strategiaAllenatore) {
        this.nomeSquadra = nomeSquadra;
        this.nomeGiocatore = StaticRandom.nomeCasuale(nomePersona);

        squadra = new ArrayList<>();
            Allenatore allenatore = new Allenatore(nomeGiocatore,StaticRandom.etaAllenatoreRandom(),StaticRandom.strategiaCasuale(strategiaAllenatore));
            squadra.add(allenatore);
        for (int i = 0; i < 11; i++) {
            Giocatore giocatore = new Giocatore(StaticRandom.nomeCasuale(nomePersona),StaticRandom.etaRandom(),StaticRandom.ruoloCasuale(ruoliGiocatore));
            squadra.add(giocatore);
        }

    }

    public Squadra(String[] arrayString1, String nomeSquadra) {

        this.nomeSquadra = nomeSquadra;
    }

    //Getter------------------------------------

    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public String getNomeGiocatore() {
        return nomeGiocatore;
    }

    //Setter-------------------------------------


    //Metodi--------------------------------------

    public static void printTeam(){
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
