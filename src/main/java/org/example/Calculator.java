package org.example;

public class Calculator {
    public int perform(int x,int y){
        return x+y;
    }
    public boolean checkEven(int a){

        return a%2==0;
    }
    public double performDivision(int x,int y){
        if(0==y){
            new ArithmeticException("denominator cann't be zero");
        }
        return x/y;
    }

}
