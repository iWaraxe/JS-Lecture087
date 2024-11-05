package com.coherentsolutions.section3;

public class GenericArray<T> {
    // Uncommenting the below line will cause a compilation error
    // private T[] array = new T[10]; // Generic array creation

    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(Class<T> clazz) {
        this.array = (T[]) java.lang.reflect.Array.newInstance(clazz, 10);
    }

    public static void main(String[] args) {
        GenericArray<String> stringArray = new GenericArray<>(String.class);
        System.out.println("Generic array created successfully.");
    }
}
