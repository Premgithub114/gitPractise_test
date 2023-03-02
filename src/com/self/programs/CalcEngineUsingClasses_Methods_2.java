package com.self.programs;

public class CalcEngineUsingClasses_Methods_2 {
    public static void main(String args[]){
        CalcEngineUsingClasses_Methods[] equations = new CalcEngineUsingClasses_Methods[4];
        equations[0]=create(20.0,5.0,'a');
        equations[1]=create(30.0,1.0,'s');
        equations[2]=create(40.0,9.0,'m');
        equations[3]=create(50.0,18.0,'d');

        for (CalcEngineUsingClasses_Methods RES:equations){
            RES.execute();
            System.out.println(RES.results);
        }
    }

    public static  CalcEngineUsingClasses_Methods create(double vals1,double vals2, char opcodes){
        CalcEngineUsingClasses_Methods equa = new CalcEngineUsingClasses_Methods();
        equa.vals1= vals1;
        equa.vals2= vals2;
        equa.opcodes= opcodes;

        return equa;
    }
}
