package com.coherentsolutions.section1;

public class GenericTuple<T, U> {
    private final T first;
    private final U second;

    public GenericTuple(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        //GenericTuple<String, Integer> tuple = new GenericTuple<>("Hello", 42);
         GenericTuple tuple = new GenericTuple<>("Hello", 42);
        //String first = tuple.getFirst(); // No casting needed
        String first = (String) tuple.getFirst(); // No casting needed
        //Integer second = tuple.getSecond(); // No casting needed
        Integer second = (Integer) tuple.getSecond(); // No casting needed
        System.out.println(first + ", " + second);
    }
}
