package com.self.programs;

public class ForEachLoop {
    public static void main(String args[]){
        float[] thevals = {21.1f,31.1f,41.1f};
        float sum = 0.0f;
        for(float val : thevals){
            sum = sum + val;
            System.out.println(sum);
        }
    }
}
