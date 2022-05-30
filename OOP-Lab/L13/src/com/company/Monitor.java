package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelArt(int x, int y, String color) {
        System.out.println("Drawing Pixel at : " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getSize() {
        return this.size;
    }

    public Resolution getNativeResolution() {
        return this.nativeResolution;
    }
}


