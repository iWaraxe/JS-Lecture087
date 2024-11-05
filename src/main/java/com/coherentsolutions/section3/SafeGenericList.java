package com.coherentsolutions.section3;

import java.util.ArrayList;
import java.util.List;

public class SafeGenericList {
    public static void addToList(List<?> list, Object obj) {
        // This method will compile, but it's not type-safe without casting.
        // To maintain type safety, consider using a generic method with bounded type parameters.
        // list.add(obj);
        // list.add(null);
    }

    public static <T> void addToListWithType(List<T> list, T obj) {
        list.add(obj);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        //addToList(stringList, "Test String Unsafe"); // Unsafe addition
        addToListWithType(stringList, "Test String Safe"); // Safe addition
        System.out.println("First item: " + stringList.get(0));
    }
}
