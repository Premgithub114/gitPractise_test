package com.self.programs;

public class ForLoop {
    public static void main(String args[]){

        int fact=1;
        for(int value=5;value>0;value--){
            fact = fact*value;
        }
        System.out.println(fact);
    }
}
