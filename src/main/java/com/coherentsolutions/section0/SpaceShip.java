package com.coherentsolutions.section0;

public class SpaceShip<T extends Human & Singer> {
    private final T occupant;

    public SpaceShip(T occupant) {
        this.occupant = occupant;
    }

    public void startConcert() {
        System.out.println("On the stage: " + occupant.getName());
        occupant.sing();
    }
}

interface Singer {
    void sing();
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

class HumanSinger extends Human implements Singer {
    public HumanSinger(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(getName() + " is singing.");
    }

    public static void main(String[] args) {
        Human human = new Human("Eugen");
        HumanSinger singer = new HumanSinger("Igor");
        SpaceShip<HumanSinger> spaceShip = new SpaceShip<>(singer);
        //SpaceShip<Human> spaceShip1 = new SpaceShip<>(human);
        spaceShip.startConcert();
    }
}
