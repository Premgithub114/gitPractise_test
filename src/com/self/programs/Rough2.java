package com.self.programs;

public class Rough2 {

    public static Rough1 create(int val1, int val2, char opcode){
        Rough1 rough1 = new Rough1();
        rough1.setValue1(val1);
        rough1.setValue2(val2);
        rough1.setOperator(opcode);

        return rough1;
    }

    public static void main(String[] args) {
        Rough1[] rough1s = new Rough1[4];
        rough1s[0] = create(10,20,'a');
        rough1s[1] = create(15,5,'s');
        rough1s[2] = create(6,6,'m');
        rough1s[3] = create(10,5,'d');

        for (Rough1 var:rough1s){
            var.logic();
            System.out.println(var.getResult());
        }


    }
}
