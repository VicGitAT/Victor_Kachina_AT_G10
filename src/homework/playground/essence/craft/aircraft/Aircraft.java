package homework.playground.essence.craft.aircraft;

import homework.playground.essence.craft.Vehicles;
import homework.playground.essence.Flyable;
import homework.playground.essence.Transportable;

public abstract class Aircraft extends Vehicles implements Flyable, Transportable {

    public Aircraft(int mass, String name) {
        super(mass, name);
    }
}
