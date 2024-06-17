package hometask.playground.essence.liquids;

import hometask.playground.essence.material.Pourable;
import hometask.playground.essence.material.Powerable;

public class Diesel extends Liquid implements Pourable, Powerable {

    public Diesel(int mass) {
        super(mass);
    }
}
