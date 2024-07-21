package main.java.hometask.playground.essence.craft.aircraft;

import main.java.hometask.playground.essence.craft.Vehicles;
import main.java.hometask.playground.essence.Flyable;
import main.java.hometask.playground.essence.Transportable;

public abstract class Aircraft extends Vehicles implements Flyable, Transportable {

    public Aircraft(int mass, String name) {
        super(mass, name);
    }
}

