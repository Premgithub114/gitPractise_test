package com.self.programs;

public class VariableScope {

    public static void main(String args[]){
        int a = 10;
        int b = 100;

        if (a<b){
            int avg = b/a;
            System.out.println(avg);
        }
        // System.out.println(avg); // avg is initialized inside the IF block. So avg cannot be used outside the If block
    }
}
