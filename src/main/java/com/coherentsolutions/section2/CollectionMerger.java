package com.coherentsolutions.section2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CollectionMerger {
    public static <T> List<T> merge(List<? extends T> left, List<? extends T> right) {
        List<T> result = new ArrayList<>(left);
        result.addAll(right);
        return result;

        //List<Integer> <- List<Number>
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Double> list2 = Arrays.asList(4.0, 5.0, 6.0);
        List<Number> mergedList = CollectionMerger.merge(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }
}
