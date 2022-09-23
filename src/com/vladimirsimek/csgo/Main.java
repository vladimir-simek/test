package com.vladimirsimek.csgo;

import java.util.ArrayList;

import static com.vladimirsimek.csgo.Repository.prepare;

public class Main {

    public static void main(String[] args) {
        ArrayList<State> states = prepare();
        Service.ukol1(states);
        System.out.println("-------------");
        Service.ukol2(states);
        System.out.println("-------------");
        Service.ukol3(states);

    }
}
