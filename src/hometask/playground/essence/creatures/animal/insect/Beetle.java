package hometask.playground.essence.creatures.animal.insect;

import hometask.playground.essence.creatures.Crawlable;
import hometask.playground.essence.creatures.plant.vegetable.Carrot;

public class Beetle extends Insect implements Crawlable {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {

        if (getMass() < home.getMass()) {
            String messageBeetle = String.format("I am %s and I will nest there with %d my family members!", getName(), home.getMass() / getMass());
            System.out.println(messageBeetle);
        } else {
            System.out.println("This carrot is too small for nesting");
        }
    }
}
