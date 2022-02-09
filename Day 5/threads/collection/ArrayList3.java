package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {
    public static void main(String[] args) {

//        Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

//        Creating instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

//        Using next() method
        int number = iterate.next();
        System.out.println("Accessed element: " + number);

//        Using remove() method
        iterate.remove();
        System.out.println("Removed Element: "+ number);

        System.out.println("Updated ArrayList:");

//        Using hasNext() method
        while (iterate.hasNext()) {
            iterate.forEachRemaining((value) -> System.out.println(value + ","));
        }
    }
}
