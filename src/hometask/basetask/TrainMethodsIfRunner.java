package hometask.basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул: " + trainMethodsIf.returnNewInt(8));
        System.out.println("метод returnNewLong вернул: " + trainMethodsIf.returnNewLong(78246));
        System.out.println("метод returnNewChar вернул: " + trainMethodsIf.returnNewChar('#'));
        System.out.println("метод returnNewFloat вернул: " + trainMethodsIf.returnNewFloat(3.14f));
        System.out.println("метод returnNewDouble вернул: " + trainMethodsIf.returnNewDouble(1.23));
        System.out.print("метод returnNewBoolean вернул: ");
        trainMethodsIf.returnNewBoolean(false);
    }
}
