package com.nespresso.sofa.recruitment.navalbattles.app;

import com.nespresso.sofa.recruitment.navalbattles.app.batteau.Batteau;

import java.util.*;
import java.util.stream.Collectors;

public class Race {

    List<Batteau> batteaus = new LinkedList<>();

    public Race(Batteau... batteausInput) {
        for (Batteau batteau : batteausInput) {
            batteau.speedOfBatteau();
            batteaus.add(batteau);
        }
    }

    public Batteau winner() {
        int winnerIndex = 0;
        batteaus = batteaus.stream().sorted(Comparator.comparing(Batteau::speedOfBatteau)).collect(Collectors.toList());
        return batteaus.get(winnerIndex);
    }
}
