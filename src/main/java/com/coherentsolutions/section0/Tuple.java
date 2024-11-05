package com.coherentsolutions.section0;

public class Tuple {
    private final Object left;
    private final Object right;

    public Tuple(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public Object getLeft() {
        return left;
    }

    public Object getRight() {
        return right;
    }

    public static void main(String[] args) {
        Tuple student1 = new Tuple(1, "Igor");
        Object name = student1.getRight(); // Requires casting to use as a String
        String nameAsString = (String) student1.getRight();
        System.out.println(name);
        System.out.println(nameAsString.toUpperCase());
    }
}

