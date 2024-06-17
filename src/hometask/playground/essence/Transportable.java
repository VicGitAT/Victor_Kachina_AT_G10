package hometask.playground.essence;

public interface Transportable {

    public default int move(int pointA, int pointB) {
        String moveMessage = String.format("I am %s, my name is %s and I am moving from point %d to point %d", getClass().getSimpleName(), getName(), pointA, pointB);
        System.out.println(moveMessage);
        return pointB - pointA;
    }

    String getName();
}
