package com.coherentsolutions.section13;

public class StaticGenericDemo<T> {
    // Illegal: Cannot make a static reference to the non-static type T
    // private static T instance;
    private T value;

    // Correct way: Use a specific type or make the method generic
    public static <E> void print(E element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        StaticGenericDemo.print("Hello");
        StaticGenericDemo.print(123);
    }
}
