package hometask.playground.essence.craft.aircraft;

import hometask.playground.essence.craft.Vehicles;
import hometask.playground.essence.Flyable;
import hometask.playground.essence.Transportable;

public abstract class Aircraft extends Vehicles implements Flyable, Transportable {

    public Aircraft(int mass, String name) {
        super(mass, name);
    }
}

