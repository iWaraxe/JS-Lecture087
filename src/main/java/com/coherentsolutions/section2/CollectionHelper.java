package com.coherentsolutions.section2;

import java.util.List;
import java.util.Arrays;

public class CollectionHelper {
    public static <T> int findIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (target.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        int index = CollectionHelper.findIndex(list, "banana");
        System.out.println("Index of 'banana': " + index);
    }
}
