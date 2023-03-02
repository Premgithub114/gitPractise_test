package com.self.programs;

public class WhileLoop {
    public static void main(String args[]){

        // Repeatedly executes the statement as long as the condition is TRUE

        /*  while (condition){
                statement
        }*/

        // Factorial Program
        int value = 5;
        int fact=1;

        while (value>0){
            fact = fact*value;
            value -= 1;
        }
        System.out.println(fact);
    }
}
