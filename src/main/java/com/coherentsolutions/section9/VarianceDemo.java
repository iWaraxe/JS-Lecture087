package com.coherentsolutions.section9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VarianceDemo {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(Double.valueOf(3.14));

        printList(numbers);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        //printList(integers); // Compile-time error: incompatible types
        printListWithWildcard(integers); // Works with wildcard
    }

    // Method accepting List<Number>
    public static void printList(List<Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    // Method accepting List<? extends Number>
    public static void printListWithWildcard(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }
}
