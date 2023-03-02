package com.self.programs;

public class Rough {

    public static void main(String[] args) {


        //factorial using for loop

//        int fact=1;
//
//        for(int value=5;value>0;value--){
//            fact=fact*value;
//        }
//        System.out.println(fact);


        // Factorial using while loop
        int factorial=1;
        int val=5;

        while (val>0){
            factorial=factorial*val;
            val--;
        }
        System.out.println(factorial);



    }
}
