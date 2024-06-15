package homework.playground.processors;

import homework.playground.essence.Transportable;

import homework.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int coordinates = transportable.move(pointA, pointB);
        String runTransportableMessage = String.format("Transportable %s was moved to %d points", getClass().getSimpleName(), coordinates);
        System.out.println(runTransportableMessage);
    }

    public void runTransportable(Transportable transportable) {
        int coordinates = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        String runTransportableMessage = String.format("Transportable %s was moved to %d points", getClass().getSimpleName(), coordinates);
        System.out.println(runTransportableMessage);
    }
}
