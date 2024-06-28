package hometask.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {
        Random random = new Random();
        String direction;
        int variableForDeterminingDirection = random.nextInt(1, 39);
        if (variableForDeterminingDirection <= 9) {
            direction = "NORTH";
        } else if (variableForDeterminingDirection <= 19) {
            direction = "SOUTH";
        } else if (variableForDeterminingDirection <= 29) {
            direction = "WEST";
        } else {
            direction = "EAST";
        }
        return direction;
    }
}
