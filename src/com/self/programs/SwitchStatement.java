package com.self.programs;

public class SwitchStatement {
    public static void main(String args[]){

        int val=10;
        System.out.println(val%2);
        switch (val%2){
            case 0:
                System.out.println(val + " is even");
                break;
            case 1:
                System.out.println(val + " is odd");
                break;

            default:
                System.out.println("neither even nor odd");
        }
    }
}
