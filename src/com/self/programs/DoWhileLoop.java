package com.self.programs;

public class DoWhileLoop {
    public static void main(String args[]){

        // Repeatedly executes the statements which are inside the do block until the while condition is False but the condition is checked at Loop end
        /*
        do {
            statements
        }
        while ();
         */

        int a = 50;
        do{
            a *=2;  // a = a*2
        }
        while (a<200);
        System.out.println(a);

    }
}
