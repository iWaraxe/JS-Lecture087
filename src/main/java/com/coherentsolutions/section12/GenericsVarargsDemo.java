package com.coherentsolutions.section12;

import java.util.Arrays;
import java.util.List;

public class GenericsVarargsDemo {

    @SafeVarargs // Indicates that the method doesn't perform unsafe operations
    public static <T> void printAll(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        printAll("One", "Two", "Three", "Four", "Five");

        List<String> list = Arrays.asList("A", "B", "C");
        printAll(list); // Warning: Type safety issue due to varargs and generics
    }
}
