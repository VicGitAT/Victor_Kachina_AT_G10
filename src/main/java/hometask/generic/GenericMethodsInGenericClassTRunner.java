package main.java.hometask.generic;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> genString = new GenericMethodsInGenericClassT<>();
        genString.genericMethodOneGenArg("bugagashenki");
        System.out.println(genString.genericMethodTwoGenArgs("bugagashenki", "awdfad"));
        genString.genericMethodHalfGenArgs("bugagashenki", "bugagashenki");

        GenericMethodsInGenericClassT<Integer> genInt = new GenericMethodsInGenericClassT<>();
        genInt.genericMethodOneGenArg(12);
        System.out.println(genInt.genericMethodTwoGenArgs(22, 1));
        genInt.genericMethodHalfGenArgs(33, "bugagashenki");
    }
}
