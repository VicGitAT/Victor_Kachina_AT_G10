package main.java.hometask.playground.essence.liquids;

import main.java.hometask.playground.essence.material.Pourable;
import main.java.hometask.playground.essence.material.Powerable;

public class Petrol extends Liquid implements Pourable, Powerable {

    public Petrol(int mass) {
        super(mass);
    }
}
