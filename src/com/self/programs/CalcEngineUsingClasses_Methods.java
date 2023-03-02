package com.self.programs;

public class CalcEngineUsingClasses_Methods {
    public double vals1;
    public double vals2;
    public char opcodes;
    public double results;

    public void execute(){
        switch (opcodes){
            case 'a':
                results=vals1+vals2;
                break;
            case 's':
                results=vals1-vals2;
                break;
            case 'm':
                results=vals1*vals2;
                break;
            case 'd':
                results = vals2!=0.0d ? vals1/vals2 : 0.0d;
                break;
            default:
                System.out.println("Please provide valid OpCode");
        }
    }
}
