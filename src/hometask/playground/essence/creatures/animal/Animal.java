package hometask.playground.essence.creatures.animal;

import hometask.playground.essence.creatures.plant.Plant;
import hometask.playground.essence.material.Matter;

public abstract class Animal extends Matter {

    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        String message = String.format("I am %s and i am eating %s", name, food.getName());
        System.out.println(message);
    }
}
