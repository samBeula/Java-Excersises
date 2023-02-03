package com.demo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet srset = new TreeSet();
        // Add the elements in the given set.
        srset.add("Audi");
        srset.add("BMW");
        srset.add("Mercedes");
        srset.add("Baleno");
        srset.add("BMW");
        srset.add("Ford");
        System.out.println("The list of elements is given as:");
        for (Object object : srset) {
            System.out.println(object);
        }
        System.out.println("The first element is given as: " + srset.first());
        System.out.println("The last element is given as: " + srset.last());
        System.out.println("The respective element is given as: " + srset.headSet("Baleno"));
        System.out.println("The respective element is given as: " + srset.tailSet("Audi"));
        srset.remove("Baleno");
        System.out.println("sorted set after removing Baleno is given as: " + srset.tailSet("Audi"));
    }
}