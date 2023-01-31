package com.demo;

public class Arithmetic {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        Arithmetic art = new Arithmetic();
        System.out.println("Addition of 10,5: "+art.add(10,5));
        System.out.println("Subtraction of 10,5: "+art.sub(10,5));
        System.out.println("Multiplication of 10,5: "+art.mul(10,5));
        System.out.println("Division of 10,5: "+art.div(10,5));

    }

}


