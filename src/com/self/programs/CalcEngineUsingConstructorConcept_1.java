package com.self.programs;

public class CalcEngineUsingConstructorConcept_1 {

    public double vals1;
    public double vals2;
    public char opcodes;
    public double results;

    // Accessor
    public double getResults(){

        return results;
    }

    // Constructor - 1 (With 1 argument)
    public CalcEngineUsingConstructorConcept_1(char opcodes){

        this.opcodes=opcodes;
    }

    // Constructor - 2 (With 3 arguments)
    public CalcEngineUsingConstructorConcept_1(char opcodes, double vals1,double vals2){
        this(opcodes);      // Importing from constructor - 1
        this.vals1=vals1;
        this.vals2=vals2;
    }

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
