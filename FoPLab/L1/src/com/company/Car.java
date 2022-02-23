package com.company;

public  class Car {

    private int doors;
    private int wheels;
    private String make;
    private String model;
    private String colour;

    //setter
    public void  setDoors(int d){
        this.doors=d;
    }

    //Getter
    public int  getDoors(){
        return this.doors;
    }

    public void setWheels(int w){
        this.wheels=w;
    }

    public int getWheels(){
        return this.wheels;
    }

    public void setMake(String m){
        this.make=m;
    }

    public String getMake(){
        return this.make;
    }

    public void setModel(String m){
        this.model=m;
    }

    public String getModel(){
        return this.model;
    }

    public void setColour(String m){
        this.colour=m;
    }

    public String getColour(){
        return this.colour;
    }
}