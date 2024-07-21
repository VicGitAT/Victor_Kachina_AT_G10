package main.java.hometask.playground.essence.liquids;

import main.java.hometask.playground.essence.material.Pourable;
import main.java.hometask.playground.essence.material.Powerable;

public class Diesel extends Liquid implements Pourable, Powerable {

    public Diesel(int mass) {
        super(mass);
    }
}
