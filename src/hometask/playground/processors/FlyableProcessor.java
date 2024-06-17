package hometask.playground.processors;

import hometask.playground.essence.Flyable;
import hometask.playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        flyable.fly(DirectionGenerator.generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}
