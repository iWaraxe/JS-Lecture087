package com.coherentsolutions.section10;

import java.util.ArrayList;
import java.util.List;

public class WildcardCaptureDemo {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

        System.out.println(ints);
        reverse(ints);
        System.out.println(ints); // Outputs: [2, 1]
    }

    public static void reverse(List<?> list) {
        reverseHelper(list);
    }

    private static <T> void reverseHelper(List<T> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
