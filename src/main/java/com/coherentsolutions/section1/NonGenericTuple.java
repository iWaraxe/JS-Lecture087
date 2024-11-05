package com.coherentsolutions.section1;

public class NonGenericTuple {
    private final Object first;
    private final Object second;

    public NonGenericTuple(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    public static void main(String[] args) {
        NonGenericTuple tuple = new NonGenericTuple("Hello", Integer.valueOf(42));
        String first = (String) tuple.getFirst(); // Casting is required
        Integer second = (Integer) tuple.getSecond(); // Casting is required
        System.out.println(first + ", " + second);
    }
}
