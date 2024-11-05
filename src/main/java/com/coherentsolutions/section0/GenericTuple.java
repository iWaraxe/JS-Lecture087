package com.coherentsolutions.section0;

public class GenericTuple<T> {
    private final T left;
    private final T right;

    public GenericTuple(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    public static void main(String[] args) {
        GenericTuple<String> student1 = new GenericTuple<>("1", "Igor");
        String name = student1.getRight(); // No casting needed
        System.out.println(name.toUpperCase());
    }
}
