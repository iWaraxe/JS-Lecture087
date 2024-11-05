package com.coherentsolutions.section11;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GenericsReflectionDemo {
    public static void main(String[] args) throws Exception {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        //stringList.add(123);

        // Use reflection to add an integer to the list
        Method addMethod = List.class.getMethod("add", Object.class);
        addMethod.invoke(stringList, 123); // Adds Integer to List<String>

        // No compile-time error, but potential ClassCastException at runtime
        for (Object obj : stringList) {
            System.out.println(obj);
        }

        for (String str : stringList) {
            System.out.println(str.toUpperCase());
        }
    }
}
