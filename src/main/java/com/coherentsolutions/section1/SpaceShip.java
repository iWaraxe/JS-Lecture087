package com.coherentsolutions.section1;

public class SpaceShip<T extends Human & Pilot> {
    private T occupant;

    public SpaceShip(T occupant) {
        this.occupant = occupant;
    }

    public void startMission() {
        System.out.println(occupant.getName() + " is starting the mission.");
        occupant.fly();
    }

    public static void main(String[] args) {
        SpaceShip<Astronaut> spaceShip = new SpaceShip<>(new Astronaut("Igor"));
        spaceShip.startMission();
    }
}

class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Pilot {
    void fly();
}

class Astronaut extends Human implements Pilot {
    public Astronaut(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying the spacecraft.");
    }
}
