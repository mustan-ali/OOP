package com.company;

public interface Shapes {

    void input();        //no method body

    void calculate_Area();       //no method body
}

//An interface is a completely "abstract class" that is used to group related methods with empty bodies.
//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with
// the implements' keyword (instead of extends).The body of the interface method is provided by the "implement" class.

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces.

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
