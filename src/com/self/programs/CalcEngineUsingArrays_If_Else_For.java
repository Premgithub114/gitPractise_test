package com.self.programs;

public class CalcEngineUsingArrays_If_Else_For {
    public static void main(String args[]){
        // Using Arrays
        double[] vals1 = {20.0d,30.0d,40.0d,50.0d};
        double[] vals2 = {5.0d,7.0d,9.0d,10.0d};
        char[] opcodes = {'a','s','m','d'};
        double[] results = new double[opcodes.length];

        for(int i=0;i<opcodes.length;i++){
            if (opcodes[i]=='a'){
                results[i]=vals1[i]+vals2[i];
            }
            else if(opcodes[i]=='s'){
                results[i]=vals1[i]-vals2[i];
            }
            else if(opcodes[i]=='m'){
                results[i]=vals1[i]*vals2[i];
            }
            else if(opcodes[i]=='d'){
                results[i] = vals2[i]!=0.0d ? vals1[i]/vals2[i] : 0.0d;
            }
            else {
                System.out.println("Please provide valid OpCode");
            }
        }
        //For each loop
        for (double eachresult:results){
            System.out.println(eachresult);
        }
    }
}
