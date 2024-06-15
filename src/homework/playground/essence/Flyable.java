package homework.playground.essence;


public interface Flyable {

    public default void fly(String direction) {
        String messageFly = String.format("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), getName(), direction);
        System.out.println(messageFly);
    }

    String getName();
}
