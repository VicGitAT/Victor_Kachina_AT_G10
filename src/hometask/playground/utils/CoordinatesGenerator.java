package hometask.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {

    public static int generateCoordinate() {
        Random random = new Random();
        int coordinate = random.nextInt(1, 79);
        System.out.println("CoordinatesGenerator: I have generated point with value: " + coordinate);
        return coordinate;
    }
}
