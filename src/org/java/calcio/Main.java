package org.java.calcio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ruoli = new ArrayList<>();
        ArrayList<String> nomi = new ArrayList<>();
        String[] nomi1 = {"Mario","Carlos","Roberto","Giacomo","Federico","Hugo"};
        String[] ruoli1 = {"Portiere","Attacante","Difensore","Centrocampista"};

        ruoli.add("Portiere");
        ruoli.add("Attacante");
        ruoli.add("Attacante");
        ruoli.add("Attacante");

        ruoli.add("Difensore");
        ruoli.add("Difensore");
        ruoli.add("Difensore");
        ruoli.add("Difensore");

        ruoli.add("Centrocampista");
        ruoli.add("Centrocampista");
        ruoli.add("Centrocampista");

        Squadra squadra = new Squadra(nomi1,ruoli1);

        Squadra.stampaNomi();




    }
}
