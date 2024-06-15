package homework.playground.essence.craft;

import homework.playground.essence.material.Matter;
import homework.playground.essence.Transportable;

public abstract class Vehicles extends Matter implements Transportable {

    protected String name;

    public Vehicles(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
