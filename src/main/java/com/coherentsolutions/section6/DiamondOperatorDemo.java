package com.coherentsolutions.section6;

import java.util.HashMap;
import java.util.Map;

public class DiamondOperatorDemo {
    public static void main(String[] args) {
        // Before Java 7
        Map<String, Integer> mapOld = new HashMap<String, Integer>();

        // Since Java 7 - Diamond Operator
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 3);
        map.put("Banana", 2);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
