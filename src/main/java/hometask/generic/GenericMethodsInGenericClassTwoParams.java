package main.java.hometask.generic;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X var1, Y var2) {
        return String.format("I received %d arguments of type: %s class, %s class", 2, var1.getClass().getSimpleName(), var2.getClass().getSimpleName());
    }

    public String genericMethodGenArgs(X var1) {
        return String.format("I received %d arguments of type: %s class", 1, var1.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(X var1, Y var2, String var3) {
        System.out.printf("I got an object of %s class and %s class and string with %d characters", var1.getClass().getSimpleName(), var2.getClass().getSimpleName(), var3.split("").length);
    }

    public void genericMethodHalfGenArgs(X var1, String var3) {
        System.out.printf("I got an object of %s class and string with %d characters", var1.getClass().getSimpleName(), var3.split("").length);
    }
}
