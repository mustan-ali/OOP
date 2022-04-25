package com.company;

public class MissionImpossible extends Movie {
    public MissionImpossible() {
        super("Mission Impossible");
    }

    @Override
//  Overriding allows a subclass to provide a specific implementation of a method that is already provided by parent classes.
    public String plot() {
        return "An agent goes for a mission which is impossible";
    }

}
