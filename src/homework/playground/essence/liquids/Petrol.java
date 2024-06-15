package homework.playground.essence.liquids;

import homework.playground.essence.material.Pourable;
import homework.playground.essence.material.Powerable;

public class Petrol extends Liquid implements Pourable, Powerable {

    public Petrol(int mass) {
        super(mass);
    }
}
