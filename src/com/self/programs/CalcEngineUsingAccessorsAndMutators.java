package com.self.programs;

public class CalcEngineUsingAccessorsAndMutators {
    private double vals1;
    private double vals2;
    private char opcodes;
    private double results;


    public double getVals1() {
        return vals1;
    }

    public void setVals1(double vals1) {
        this.vals1 = vals1;
    }

    public double getVals2() {
        return vals2;
    }

    public void setVals2(double vals2) {
        this.vals2 = vals2;
    }

    public char getOpcodes() {

        return opcodes;
    }

    public void setOpcodes(char opcodes) {
        this.opcodes = opcodes;
    }

    public double getResults() {

        return results;
    }


    public void execute() {
        switch (opcodes) {
            case 'a':
                results = vals1 + vals2;
                break;
            case 's':
                results = vals1 - vals2;
                break;
            case 'm':
                results = vals1 * vals2;
                break;
            case 'd':
                results = vals2 != 0.0d ? vals1 / vals2 : 0.0d;
                break;
            default:
                System.out.println("Please provide valid OpCode");
        }
    }
}
