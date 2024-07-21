package main.java.hometask.playground.essence.craft.field;

import main.java.hometask.playground.essence.craft.Vehicles;
import main.java.hometask.playground.essence.Rideable;
import main.java.hometask.playground.essence.Transportable;

public abstract class Vehicle extends Vehicles implements Transportable, Rideable {

    public Vehicle(int mass, String name) {
        super(mass, name);
    }
}
