package com.coherentsolutions.section0;

import java.util.List;
import java.util.ArrayList;

public class CollectionHelper {
    public static <T> int findIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int index = CollectionHelper.findIndex(list, "b");
        System.out.println("Index of 'b': " + index);
        index = CollectionHelper.findIndex(list, "d");
        System.out.println("Index of 'd': " + index);
    }
}
