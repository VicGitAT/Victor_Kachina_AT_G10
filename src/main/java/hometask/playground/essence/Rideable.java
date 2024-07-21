package main.java.hometask.playground.essence;

public interface Rideable {

    public default void ride(String direction) {
        String messageFly = String.format("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), getName(), direction);
        System.out.println(messageFly);
    }

    String getName();
}
