package com.self.programs;

public class ConditionalAssignment {

    public static void main(String args[]){
        int val1=10;
        int val2=9;

        // int result = condition ? if condition is true, this will execute : If condition is false, this will execute
        int result1= val1>val2 ? val1  :  val2;
        System.out.println(result1);

        int students = 50;
        int room = 5;

        // int result = condition ? if condition is true, this will execute : If condition is false, this will execute
        int studentsperroom = students==1 ? 1 : students/room;
        System.out.println(studentsperroom);
    }
}
