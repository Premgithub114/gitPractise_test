package com.self.programs;

public class Typeconversion {
    public static void main(String args[]){
        byte bval = 7;
        short sval = 1;
        long lval = 5;
        float fval = 1.0f;
        double dval = 4.0d;

        short result1 = bval;  // byte value can be converted into short

        // short result2 = lval; // cannot convert directly from long to short, we should convert explicitly as below

        short result2 = (short)lval;

        // short result3 = bval-lval;  // cannot perform this operation like this because we cannot convert long to short implicitly
                                       // check below how to do this operation

        short result3 = (short) (bval-lval);

        // long result4 = lval-fval;   // cannot convert directly from float to long, we should convert explicitly as below

        long result4 = (long) (lval-fval);

        float result5 = lval-fval;   // long value can be converted into float

        // float result6 = fval-dval;  // // cannot convert directly from double to float, we should convert explicitly as below

        float result6 = (float) (fval-dval);

        double result7 = fval-dval;  // float value can be converted into double


        System.out.println("success");
    }


}
