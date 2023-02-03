package com.demo;



import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        try {
            List lnlist = new LinkedList<String>();
            lnlist.add("a1");
            lnlist.add("b1");
            lnlist.add("c1");
            lnlist.add("d1");
            lnlist.add("e1");
            System.out.println("Length of 1st LinkedList: " + lnlist.size());
            System.out.println("is c1 in 1st linked list");
            System.out.println((lnlist.contains("c1"))?"yes":"no");
            lnlist.remove("c1");
            System.out.println("ic c1 present in 1st linked list after removing");
            System.out.println((lnlist.contains("c1"))?"yes":"no");
            System.out.println("First element: " + lnlist.get(0));
            //System.out.println("Eighth element: " + lnlist.get(8));
            System.out.println("Is the LinkedList empty after clearing: ");
            lnlist.clear();
            System.out.println(lnlist.isEmpty());
            lnlist.add("a1");
            lnlist.add("b1");
            lnlist.add("c1");
            lnlist.add("d1");
            lnlist.add("e1");
            List ln2list = new LinkedList();
            ln2list.addAll(lnlist);
            System.out.println("Length of 2nd LinkedList: " + ln2list.size());
            System.out.println("is c1 in 2nd linked list");
            System.out.println((ln2list.contains("c1"))?"yes":"no");
            ln2list.remove("c1");
            System.out.println("is c1 present in 2nd LinkedList after removing");
            System.out.println((ln2list.contains("c1"))?"yes":"no");
            System.out.println("First element: " + ln2list.get(0));
            System.out.println("Eighth element: " + ln2list.get(8));
            System.out.println("Is the 2nd Linked List empty after clearing: ");
            ln2list.clear();
            System.out.println(ln2list.isEmpty());
        } catch(IndexOutOfBoundsException lnin) {
            System.out.println(lnin.getMessage());
        }
        System.out.println("Linked list operations successful");
    }
}
