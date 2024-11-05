package com.coherentsolutions.section0;

public class TupleIntString {
    private final int left;
    private final String right;

    public TupleIntString(int left, String right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    public static void main(String[] args) {
        TupleIntString student1 = new TupleIntString(1, "Igor");
        String name = student1.getRight();// Requires casting to use as a String
        System.out.println(name);
    }
}
