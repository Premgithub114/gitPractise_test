package com.self.programs;

public class Arrays {

    // Array is a collection of homogeneous data
    // It's size is fixed
    // We can also create multidimensional array
    public static void main(String args[]){
       float[] vals = {11.2f,23.1f,98.1f};
       //int[] arr = new int[5];
//        arr[0] = 2;
        // arr[1] = 3;
        // arr[2] = 4;
//        System.out.println(arr);

        float sum = 0.0f;
        for(int i=0; i<vals.length;i++){
            sum += vals[i];
            System.out.println(sum);
        }

    }
}
