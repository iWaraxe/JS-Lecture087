package com.coherentsolutions.section16;

import java.util.ArrayList;
import java.util.List;

public class WildcardsGuidelinesDemo {
    public static void main(String[] args) {
        // ? - Unbounded wildcard
        // ? extends Type - Upper bounded wildcard
        // ? super Type - Lower bounded wildcard
        List<Object> objects = new ArrayList<>();
        addNumbers(objects);

        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);

        // List<Integer> integers = new ArrayList<>();
        // addNumbers(integers); // Compile-time error

        System.out.println(objects);
        System.out.println(numbers);
    }

    public static void addNumbers(List<? super Number> list) {
        list.add(Integer.valueOf(1));
        list.add(Double.valueOf(2.5));
    }
}

