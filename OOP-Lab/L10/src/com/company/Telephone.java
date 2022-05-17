package com.company;

public interface Telephone {
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    void callPhone(int phoneNumber);

    boolean isRinging();

}

//An interface is a completely "abstract class" that is used to group related methods with empty bodies.
//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with
// the implements' keyword (instead of extends).The body of the interface method is provided by the "implement" class: