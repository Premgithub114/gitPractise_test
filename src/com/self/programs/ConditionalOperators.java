package com.self.programs;

public class ConditionalOperators {
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        // Conditional AND (&&)
        if(a>100 && b>10){        // a>100 will be False. So b>10 will not execute and It will not go inside IF block
            System.out.println(b/a);
        }
    }
}
