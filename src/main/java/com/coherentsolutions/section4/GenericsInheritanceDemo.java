package com.coherentsolutions.section4;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritanceDemo {
    public static void main(String[] args) {
        // Compile-time error: incompatible types
        // List<Object> objectList = new ArrayList<String>();

        // Correct usage with wildcards
        List<? extends Object> objectList = new ArrayList<String>();
        //objectList.add(new Object()); // Error: cannot add to List<? extends Object>

        // Demonstrate reading elements
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        printList(stringList); // Works with List<? extends Object>
    }

    public static void printList(List<? extends Object> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
