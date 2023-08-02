package org.java.calcio;

import java.util.ArrayList;
import java.util.Random;

public class Partita {

    private static boolean statoPartita; //true: Iniziata False: Ferma/Finita

    private static int squadra1;

    private static int squadra2;

    private static ArrayList<String> marcatore;

    //Getter----------------------------------

    public static boolean isStatoPartita() {
        return statoPartita;
    }

    public static int getSquadra1() {
        return squadra1;
    }

    public static int getSquadra2() {
        return squadra2;
    }


    //Setter------------------------------------

    public static void startPartita() {
        Partita.statoPartita = true;
    }
    //Metodi---------------------------------
    public static void goal(Squadra squadra1, Squadra squadra2){
        if (statoPartita) {
            Random random = new Random();
            int goal = random.nextInt(1, 2);
            if (goal == 1) {
                Partita.squadra1 += 1;
                System.out.println("Ha segnato la squadra " + squadra1.getNomeSquadra());
            }
            if (goal == 2) {
                Partita.squadra2 += 1;
                System.out.println("Ha segnato la squadra " + squadra2.getNomeSquadra());
            }
        }else {
            throw new RuntimeException("Partita non iniziata");
        }
    }

    public static void marcatore(){
        for (String i: Partita.marcatore) {
            System.out.println(i);
        }
    }




}
