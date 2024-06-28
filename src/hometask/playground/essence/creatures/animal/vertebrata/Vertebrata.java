package hometask.playground.essence.creatures.animal.vertebrata;

import hometask.playground.essence.creatures.animal.Animal;
import hometask.playground.essence.creatures.animal.insect.Insect;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        String message = String.format("I am %s and i am eating %s", name, food.getName());
        System.out.println(message);
    }
}
