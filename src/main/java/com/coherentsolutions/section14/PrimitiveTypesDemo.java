package com.coherentsolutions.section14;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        // List<int> intList = new ArrayList<>(); // Compile-time error

        // Use wrapper class Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        int sum = 0;
        for (int num : intList) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
