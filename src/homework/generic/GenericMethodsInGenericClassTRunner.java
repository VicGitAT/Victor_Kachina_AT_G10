package homework.generic;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String, Integer> genStringInt = new GenericMethodsInGenericClassT<>();
        genStringInt.genericMethodOneGenArg("bugagashenki");
        System.out.println(genStringInt.genericMethodTwoGenArgs("bugagashenki", 2));
        genStringInt.genericMethodHalfGenArgs("bugagashenki", "bugagashenki");

        GenericMethodsInGenericClassT<Integer, Double> genIntDouble = new GenericMethodsInGenericClassT<>();
        genIntDouble.genericMethodOneGenArg(12);
        System.out.println(genIntDouble.genericMethodTwoGenArgs(22, 22.0));
        genIntDouble.genericMethodHalfGenArgs(33, "bugagashenki");


    }
}
