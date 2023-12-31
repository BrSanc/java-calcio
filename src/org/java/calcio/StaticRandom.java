package org.java.calcio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class StaticRandom {

    private static final String[] NOMICALCIATORI = {"Mario","Carlos","Roberto","Giacomo","Federico","Hugo","Eric","Cristian","Francesco","Lorenzo","Andrea","Riccardo","Diego","Marco","Davide"};
    private static final String[] RUOLICALCIATORI = {"Portiere","Attacante","Difensore","Centrocampista"};
    private static final String[] STRATEGIEALLENATORE = {"4-2-3-1","3-4-3","4-5-1","4-4-2"};
    Random random = new Random();

    /* public static String ruoloCasuale (ArrayList arrayList){
        Random random = new Random();
        String nomeCasuale = String.valueOf(arrayList.get(random.nextInt(0,arrayList.size())));
        return nomeCasuale;
    }*/

    public static String strategiaCasuale(String[] arrayString){
        Random random = new Random();
        String nomeCasuale = arrayString[random.nextInt(0, arrayString.length)];
        return nomeCasuale;
    }
    public static String ruoloCasuale(String[] arrayString){
        Random random = new Random();
        String nomeCasuale = arrayString[random.nextInt(0, arrayString.length)];
        return nomeCasuale;
    }


    public static String nomeCasuale(String[] arrayString){
        Random random = new Random();
        String nomeCasuale = arrayString[random.nextInt(0, arrayString.length)];
        return nomeCasuale;
    }

    public static int etaRandom(){
        Random random = new Random();
        int etaRandom = random.nextInt(21,35);
        return etaRandom;
    }

    public static int etaAllenatoreRandom(){
        Random random = new Random();
        int etaRandom = random.nextInt(30,55);
        return etaRandom;
    }



}
