package com.self.programs;

public class CalcEngineUsingAccessorsAndMutators_2 {

    public static CalcEngineUsingAccessorsAndMutators create(double vals3, double vals4, char opcodes1){
        CalcEngineUsingAccessorsAndMutators equa = new CalcEngineUsingAccessorsAndMutators();
        equa.setVals1(vals3);
        equa.setVals2(vals4);
        equa.setOpcodes(opcodes1);

        return equa;
    }

    public static void main(String args[]){
        CalcEngineUsingAccessorsAndMutators[] equations = new CalcEngineUsingAccessorsAndMutators[4];
        equations[0]=create(20.0,5.0,'a');
        equations[1]=create(30.0,1.0,'s');
        equations[2]=create(40.0,9.0,'m');
        equations[3]=create(50.0,18.0,'d');

        for(CalcEngineUsingAccessorsAndMutators RES:equations){
            RES.execute();
            //System.out.println(RES);
            System.out.println(RES.getResults());
        }
    }


}
