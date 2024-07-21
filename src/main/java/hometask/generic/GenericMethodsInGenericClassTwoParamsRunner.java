package main.java.hometask.generic;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> stringString = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(stringString.genericMethodGenArgs("bugaga", "bugagashenki"));
        System.out.println(stringString.genericMethodGenArgs("bugaga"));
        stringString.genericMethodHalfGenArgs("ylulu", "kykareky");
        stringString.genericMethodHalfGenArgs("String1", "String2", "String3");

        GenericMethodsInGenericClassTwoParams<String, Integer> stringInteger = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(stringInteger.genericMethodGenArgs("String", 5));
        System.out.println(stringInteger.genericMethodGenArgs("String"));
        stringInteger.genericMethodHalfGenArgs("String", "bugagashenki");
        stringInteger.genericMethodHalfGenArgs("String1", 22, "bugagashenki");

        GenericMethodsInGenericClassTwoParams<String, Double> stringDouble = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(stringDouble.genericMethodGenArgs("String", 1.1));
        System.out.println(stringDouble.genericMethodGenArgs("String"));
        stringDouble.genericMethodHalfGenArgs("String", "bugagashenki");
        stringDouble.genericMethodHalfGenArgs("String1", 22.22, "bugagashenki");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> integerInteger = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(integerInteger.genericMethodGenArgs(5, 10));
        System.out.println(integerInteger.genericMethodGenArgs(7));
        integerInteger.genericMethodHalfGenArgs(2, "bugagashenki");
        integerInteger.genericMethodHalfGenArgs(1, 22, "bugagashenki");
    }
}
