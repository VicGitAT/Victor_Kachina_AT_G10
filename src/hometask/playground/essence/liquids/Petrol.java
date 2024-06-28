package hometask.playground.essence.liquids;

import hometask.playground.essence.material.Pourable;
import hometask.playground.essence.material.Powerable;

public class Petrol extends Liquid implements Pourable, Powerable {

    public Petrol(int mass) {
        super(mass);
    }
}
