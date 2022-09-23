package com.vladimirsimek.csgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class Service {
    public static void ukol1(ArrayList<State> states) {
        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).getPopulation() >= 200000000){
                System.out.println(states.get(i).getState() + " - " + (states.get(i).getGdp() / states.get(i).getPopulation()));
            }
        }
    }

    public static void ukol2(ArrayList<State> states){
        var russia = states.stream()
                .filter(state -> Objects.equals(state.getState(), "Russia"))
                .findAny();

        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).getPopulation() > russia.get().getPopulation()){
                System.out.println(states.get(i).getState());
            }
        }
    }

    public static void ukol3(ArrayList<State> states) {
        var germany = states.stream()
                .filter(state -> Objects.equals(state.getState(), "Germany"))
                .findAny();

        ArrayList<String> stateNames = new ArrayList<String>();

        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).getContinent().equals("Europe")){
                double roundOff = Math.round((double) states.get(i).getPopulation() / germany.get().getPopulation() * 100 * 100.0) / 100.0;
                stateNames.add(states.get(i).getState());
            }
        }
        String[] statesLol = stateNames.toArray(new String[0]);
        Arrays.sort(statesLol, (str1, str2) -> Integer.compare(str2.length(), str1.length()));

        for (int i = 0; i < statesLol.length; i++) {
            String curr = statesLol[i];
            var res = states.stream()
                    .filter(state -> Objects.equals(state.getState(), curr))
                    .findAny();
            double roundOff = Math.round((double) res.get().getPopulation() / germany.get().getPopulation() * 100 * 100.0) / 100.0;
            System.out.println(curr + " "+ roundOff + "%");
        }

    }

}
