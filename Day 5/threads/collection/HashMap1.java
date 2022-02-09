package com.collection;

import java.util.Map;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {

//        Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

//        Inserting elements in hashMap
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

//        Accessing keys of map
        System.out.println("Keys: " + numbers.keySet());

//        Accessing values of map
        System.out.println("Values: " + numbers.values());

//        Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

//        Removing elements from map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
    }
}
