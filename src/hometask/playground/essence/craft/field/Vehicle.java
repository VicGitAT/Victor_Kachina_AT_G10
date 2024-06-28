package hometask.playground.essence.craft.field;

import hometask.playground.essence.craft.Vehicles;
import hometask.playground.essence.Rideable;
import hometask.playground.essence.Transportable;

public abstract class Vehicle extends Vehicles implements Transportable, Rideable {

    public Vehicle(int mass, String name) {
        super(mass, name);
    }
}
