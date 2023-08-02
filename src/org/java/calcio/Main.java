package org.java.calcio;

import java.util.ArrayList;

public class Main {
    private static final String[] NOMICALCIATORI = {"Mario","Carlos","Roberto","Giacomo","Federico","Hugo","Eric","Cristian","Francesco","Lorenzo","Andrea","Riccardo","Diego","Marco","Davide"};
    private static final String[] RUOLICALCIATORI = {"Portiere","Attacante","Difensore","Centrocampista"};
    private static final String[] STRATEGIEALLENATORE = {"4-2-3-1","3-4-3","4-5-1","4-4-2"};
    public static void main(String[] args) {

        /*String[] nomi1 = {"Mario","Carlos","Roberto","Giacomo","Federico","Hugo","Eric","Cristian","Francesco",
                "Lorenzo","Andrea","Riccardo","Diego","Marco","Davide"};
        String[] ruoli1 = {"Portiere","Attacante","Difensore","Centrocampista"};
        String[] strategia1 = {"4-2-3-1","3-4-3","4-5-1","4-4-2"};*/


        Squadra drimtim = new Squadra("DrimTim",NOMICALCIATORI,RUOLICALCIATORI,STRATEGIEALLENATORE);
        Squadra timdrim = new Squadra("TimDrim",NOMICALCIATORI,RUOLICALCIATORI,STRATEGIEALLENATORE);

        System.out.println("Squadra "+ drimtim.getNomeSquadra());
        drimtim.printTeam();
        System.out.println();
        System.out.println("Squadra "+ timdrim.getNomeSquadra());
        timdrim.printTeam();

        System.out.println();
        Partita.startPartita();
        System.out.println("Partita Iniziata!!!");
        Partita.goal(drimtim,timdrim);



    }
}
