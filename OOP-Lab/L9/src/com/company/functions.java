package com.company;

public interface functions {

    float add(float a, float b);        //no method body

    float subtract(float a, float b);

    float multiply(float a, float b);

    float divide(float a, float b);

}

//An interface is a completely "abstract class" that is used to group related methods with empty bodies.
//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with
// the implements' keyword (instead of extends).The body of the interface method is provided by the "implement" class:
