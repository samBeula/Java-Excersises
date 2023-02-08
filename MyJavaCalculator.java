package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MyJavaCalculator {

    public static void main(String[] args) {

        ArrayList n = new ArrayList();
        ArrayList<String> s = new ArrayList();
        int l = 5;

        for(int i=0;i<l;i++){
            System.out.println("Enter " + i +"th number:");
            Scanner x = new Scanner(System.in);
            n.add(x.nextFloat());
            if (i <= l-2){
                System.out.println("Enter +/-/*// :");
                Scanner y = new Scanner(System.in);
                s.add(y.next());
            }
        }

        for (int i = 0; i < l-1 ;i++){
            System.out.print(n.get(i)+" "+s.get(i)+" ");
        }
        System.out.println(n.get(l-1)+" =");

        float sum = (float) n.get(0);
        for(int i = 0; i < l-1; i++){
            switch (s.get(i)){
                case "+" :
                    sum = sum + (float) n.get(i+1);
                    break;
                case "-" :
                    sum = sum - (float) n.get(i+1);
                    break;
                case "*" :
                    sum = sum * (float) n.get(i+1);
                    break;
                case "/" :
                    sum = sum / (float) n.get(i+1);
                    break;
                default :
                    i = i - 1;
                    sum = sum;
                    break;
            }
        }
        System.out.println(sum);

    }
}
