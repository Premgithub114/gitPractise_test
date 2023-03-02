package com.self.programs;

public class CalcEngine {
    public static void main(String args[]){
        int val1 = 20;
        int val2 = 10;
        char opcode = 'd';
        float result = 0;

        if(opcode=='a'){
            result = val1+val2;
        }
        else if(opcode=='s'){
            result=val1-val2;
        }
        else if (opcode=='M'){
            result=val1*val2;
        }
        else if(opcode=='d'){
            result = val2 != 0 ? val1/val2 : 0;
        }
        else {
            System.out.println("Error - Invalid Opcode");
        }
        System.out.println(result);
    }
}
