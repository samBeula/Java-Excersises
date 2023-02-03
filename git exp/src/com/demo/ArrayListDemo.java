package com.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        try{
            List alist = new ArrayList();
            alist.add("a1");
            alist.add("b1");
            alist.add("c1");
            alist.add("d1");
            alist.add("e1");
            System.out.println("Length of Array: " + alist.size());
            System.out.println("is c1 present in 1st array");
            System.out.println((alist.contains("c1"))?"yes":"no");
            alist.remove("c1");
            System.out.println("is c1 present in 1st array after removing");
            System.out.println((alist.contains("c1"))?"yes":"no");
            System.out.println("First element: " + alist.get(0));
            //System.out.println("Eighth element: " + alist.get(8));
            System.out.println("Is the array empty after clearing: ");
            alist.clear();
            System.out.println(alist.isEmpty());
            alist.add("a1");
            alist.add("b1");
            alist.add("c1");
            alist.add("d1");
            alist.add("e1");
            List a2list = new ArrayList();
            a2list.addAll(alist);
            System.out.println("Length of 2nd Array: " + a2list.size());
            System.out.println("is c1 present in 2nd array\n"+ ((a2list.contains("c1"))?"yes":"no"));
            a2list.remove("c1");
            System.out.println("is c1 present in 2nd array after removing");
            System.out.println((a2list.contains("c1"))?"yes":"no");
            System.out.println("First element: " + a2list.get(0));
            System.out.println("Eighth element: " + a2list.get(8));
            System.out.println("Is the 2nd array empty after clearing: ");
            a2list.clear();
            System.out.println(a2list.isEmpty());

        } catch (IndexOutOfBoundsException arin){
            System.out.println(arin.getMessage());
        }
        System.out.println("Array Operations are successful");
    }
}
