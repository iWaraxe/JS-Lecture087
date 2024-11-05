package com.coherentsolutions.section8;

public class GenericComparableDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);

        if (p1.compareTo(p2) > 0) {
            System.out.println(p1.getName() + " is older than " + p2.getName());
        } else {
            System.out.println(p2.getName() + " is older than " + p1.getName());
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // Implement compareTo method
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}
