package main.java.hometask.playground.essence.creatures.animal.vertebrata;

import main.java.hometask.playground.essence.creatures.animal.Animal;
import main.java.hometask.playground.essence.creatures.animal.insect.Insect;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        String message = String.format("I am %s and i am eating %s", name, food.getName());
        System.out.println(message);
    }
}
