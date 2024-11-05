package com.coherentsolutions.section5;

import java.util.ArrayList;
import java.util.List;

public class RawTypesDemo {
    public static void main(String[] args) {
        // Using a raw type
        List rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123); // Allowed, but unsafe

        // Causes ClassCastException at runtime
        try {
            for (Object obj : rawList) {
                String str = (String) obj; // Runtime exception when casting Integer to String
                System.out.println(str);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        // Using generics for type safety
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        //stringList.add(123); // Compile-time error

        for (String str : stringList) {
            System.out.println(str); // No casting needed
        }
    }
}
