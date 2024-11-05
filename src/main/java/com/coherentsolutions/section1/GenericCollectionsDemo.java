package com.coherentsolutions.section1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GenericCollectionsDemo {
    public static void main(String[] args) {
        // Demonstrating generic List
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Generics");

        // Demonstrating generic Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 1);
        map.put("Value", 2);

        System.out.println("List: " + stringList);
        System.out.println("Map: " + map);
    }
}
