package main.java.hometask.playground.runners;

import main.java.hometask.playground.essence.Flyable;
import main.java.hometask.playground.essence.craft.aircraft.Copter;
import main.java.hometask.playground.essence.craft.aircraft.Plane;
import main.java.hometask.playground.essence.craft.aircraft.Rocket;
import main.java.hometask.playground.essence.craft.aircraft.Aircraft;
import main.java.hometask.playground.essence.creatures.animal.insect.Fly;
import main.java.hometask.playground.essence.creatures.animal.insect.Insect;
import main.java.hometask.playground.essence.creatures.animal.insect.Mosquito;
import main.java.hometask.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {

    public static void main(String[] args) {
        FlyableProcessor flyableProcessor = new FlyableProcessor();
        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        flyableProcessor.runFlyable(flyableCopter);
        flyableProcessor.runFlyable(flyablePlane);
        flyableProcessor.runFlyable(flyableRocket);
        flyableProcessor.runFlyable(flyableFly);
        flyableProcessor.runFlyable(flyableMosquito);
        flyableProcessor.runFlyable(aircraftCopter);
        flyableProcessor.runFlyable(aircraftPlane);
        flyableProcessor.runFlyable(aircraftRocket);
        //flyableProcessor.runFlyable(insectFly); Insect не имплементится от Flyable
        //flyableProcessor.runFlyable(insectMosquito);
        flyableProcessor.runFlyable(aCopter);
        flyableProcessor.runFlyable(aPlane);
        flyableProcessor.runFlyable(aRocket);
        flyableProcessor.runFlyable(aFly, "никуда");
        flyableProcessor.runFlyable(aMosquito, "повсюду");
    }
}
