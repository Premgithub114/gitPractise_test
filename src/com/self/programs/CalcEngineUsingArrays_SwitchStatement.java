package com.self.programs;

public class CalcEngineUsingArrays_SwitchStatement {
    public static void main(String args[]){
        // Using Arrays
        double[] vals1 = {20.0d,30.0d,40.0d,50.0d};
        double[] vals2 = {5.0d,7.0d,9.0d,10.0d};
        char[] opcodes = {'a','s','m','d'};
        double[] results = new double[opcodes.length];

        for (int i=0;i<opcodes.length;i++){
            switch (opcodes[i]){
                case 'a':
                    results[i]=vals1[i]+vals2[i];
                    break;
                case 's':
                    results[i]=vals1[i]-vals2[i];
                    break;
                case 'm':
                    results[i]=vals1[i]*vals2[i];
                    break;
                case 'd':
                    results[i] = vals2[i]!=0.0d ? vals1[i]/vals2[i] : 0.0d;
                    break;
                default:
                    System.out.println("Please provide valid OpCode");
            }
        }
        for (double newresult:results){
            System.out.println(newresult);
        }
    }
}
