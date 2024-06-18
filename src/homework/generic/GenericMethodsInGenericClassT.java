package homework.generic;

public class GenericMethodsInGenericClassT<T, P> {

    public void genericMethodOneGenArg(T var) {
        String message = String.format("I am an object of %s class", var.getClass().getSimpleName());
        System.out.println(message);
    }

    public String genericMethodTwoGenArgs(T var1, P var2) {
        return String.format("We are objects of %s class and %s class", var1.getClass().getSimpleName(), var2.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(T var, String arg) {
        String message = String.format("I got an object of %s class and string with %d characters", var.getClass().getSimpleName(), arg.split("").length);
        System.out.println(message);
    }


}
