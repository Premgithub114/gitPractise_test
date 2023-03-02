package com.self.programs;

public class Rough1 {

    private int value1;
    private int value2;
    private char operator;
    private double result;

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void logic(){
        switch (operator){
            case 'a':
                result = value1+value2;
                break;
            case 's':
                result = value1-value2;
                break;
            case 'm':
                result = value1*value2;
                break;
            case 'd':
                result = value2!=0 ? value1/value2 : 0;
                break;
            default:
                System.out.println("Invalid operator entered");
                break;
        }
    }
}
