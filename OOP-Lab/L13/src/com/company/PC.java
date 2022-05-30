package com.company;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getTheCase() {
        return this.theCase;
    }

    public Monitor getTheMonitor() {
        return this.theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return this.theMotherboard;
    }
}
