package com.self.programs;

public class OperatorPrecedence {

    public static void main(String[] args) {
        int var1 = 21;
        int var2 = 6;
        int var3 = 3;
        int var4 = 1;

        /*
        Operator precedence:

        Postfix (x++, x--)
        Prefix (++x, --x)
        Multiplicative (* / %)
        Additive (+ -)

         */

        int result1 = var1 - var2 / var3;
        // Step 1 - Multiplicative var2/var3
        // Step 2 - Additive var1 - result of step1
        System.out.println(result1);
        int result2 = (var1 - var2) / var3;
        System.out.println(result2);

        int result3 = var1 / var3 * var4 + var2;
        // Step 1 - Multiplicative var1/var3
        // Step 2 - Multiplicative result of step 1 * var4
        // Step 3 - Additive Result of step 2 + var2
        System.out.println(result3);
        int result4 = var1 / (var3 * (var4 + var2));
        System.out.println(result4);

    }
}
