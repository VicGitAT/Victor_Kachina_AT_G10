package homework.playground.essence.liquids;

import homework.playground.essence.material.Pourable;
import homework.playground.essence.material.Powerable;

public class Diesel extends Liquid implements Pourable, Powerable {

    public Diesel(int mass) {
        super(mass);
    }
}
