package com.self.programs;

public class CalcEngineUsingConstructorConcept_2 {
    public static void main(String args[]){

        CalcEngineUsingConstructorConcept_1[] equations=new CalcEngineUsingConstructorConcept_1[4];
        equations[0]=new CalcEngineUsingConstructorConcept_1('a',20.0,5.0);
        equations[1]=new CalcEngineUsingConstructorConcept_1('s',30.0,2.0);
        equations[2]=new CalcEngineUsingConstructorConcept_1('m',40.0,4.0);
        equations[3]=new CalcEngineUsingConstructorConcept_1('d',50.0,9.0);

        for (CalcEngineUsingConstructorConcept_1 obj:equations){
            obj.execute();
            System.out.println(obj.getResults());
        }
    }
}
