package homework.playground.essence.craft.field;

import homework.playground.essence.craft.Vehicles;
import homework.playground.essence.Rideable;
import homework.playground.essence.Transportable;

public abstract class Vehicle extends Vehicles implements Transportable, Rideable {

    public Vehicle(int mass, String name) {
        super(mass, name);
    }
}
