package com.demo;

public class IfStmtDemo {
    public static void main(String[] argss){
        int x = 10;

        if( x < 20 ) {
            System.out.println("Simple if: x<20");
        }
        int a = 30;

        if( a < 20 ) {
            System.out.println("If else smt: a<20");
        }else {
            System.out.println("If else stmt: a>20");
        }
        int b = 30;
        int c = 10;

        if( b == 30 ) {
            if( c == 10 ) {
                System.out.println("Nested if stmt: b = 30 and c = 10");
            }
        }
    }
}
