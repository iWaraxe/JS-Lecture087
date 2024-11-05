package com.coherentsolutions.section15;

public class TypeErasureDemo {
    public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>("Hello");
        GenericClass<Integer> integerInstance = new GenericClass<>(123);

        // At runtime, both instances are of type GenericClass
        System.out.println(stringInstance.getClass() == integerInstance.getClass()); // Outputs: true
    }
}

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }
}
