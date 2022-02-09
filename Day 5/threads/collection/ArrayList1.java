package com.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

//        creating array list
        List<Integer> numbers = new ArrayList<>();

//        Adding elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List:" + numbers);

//        Accessing elements from numbers list
        int number = numbers.get(2); // get(index)
        System.out.println("Accessed element: " + number); //3
        number = numbers.get(1);
        System.out.println("Accessed element: " + number); //2

//        Removing element from the list
        int removeNumber = numbers.remove(1);
        System.out.println("Removed Element:" + removeNumber);
    }
}
