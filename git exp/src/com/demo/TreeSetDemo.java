package com.demo;

import java.util.TreeSet;
import java.util.Iterator;
class TreeSetDemo{
    public static void main(String args[]){
        TreeSet trset=new TreeSet();
        trset.add("George");
        trset.add("Terry");
        trset.add("Ashi");
        trset.add("Danny");
        trset.add("Joshi");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=trset.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        trset.remove("Terry");
        System.out.println("Traversing elements in tree set after removing Terry");
        i = trset.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("The first element is given as: " + trset.first());
        System.out.println("The last element is given as: " + trset.last());
    }
}
