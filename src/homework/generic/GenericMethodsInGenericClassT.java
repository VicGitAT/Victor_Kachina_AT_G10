package homework.generic;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T var) {
        System.out.printf("I am an object of %s class", var.getClass().getSimpleName());
    }

    public String genericMethodTwoGenArgs(T var1, T var2) {
        return String.format("We are objects of %s class and %s class", var1.getClass().getSimpleName(), var2.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(T var, String arg) {
        System.out.printf("I got an object of %s class and string with %d characters", var.getClass().getSimpleName(), arg.split("").length);
    }


}
