package com.coherentsolutions.section7;

public class GenericsExceptionDemo {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    // Cannot declare a generic exception class
    // public class CustomException<T> extends Exception {} // Illegal

    // Custom exception without generics
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void throwException() throws CustomException {
        throw new CustomException("Generics cannot be used with exceptions.");
    }
}
