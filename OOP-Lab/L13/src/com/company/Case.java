package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }


    public void pressPowerButton(){
        System.out.println("Power Button is pressed.");
    }

    public void pressResetButton(){
        System.out.println("Reset Button is pressed.");
    }
}
