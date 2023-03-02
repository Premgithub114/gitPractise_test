package com.self.programs;


/*
 Accessors - Getters - If there are some private variables in a class, we can access in a getter method
 in the same class and this getter method which has private variables in it can be accessed outside the class

 Mutators - Setters - setter are used to set the values of private variables in the class. Using setters,
 we can update the private variables value outside the class

 We need getters and setters to protect sensitive information in a program.
 Using these standard methods, information is protected from Illegal use
 */
public class AccessorsAndMutators {

    private int passengers;
    private int seats;

    // Accessor retrieve field value. Also called Getter
    public int getSeats(){

        return seats;
    }

    public void setSeats(int seats){

        this.seats=seats;
    }
}
