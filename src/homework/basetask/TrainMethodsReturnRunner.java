package homework.basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул: " + trainMethodsReturn.returnNewInt(5));
        System.out.println("метод returnNewLong вернул: " + trainMethodsReturn.returnNewLong(1234567));
        System.out.println("метод returnNewChar вернул: " + trainMethodsReturn.returnNewChar('@'));
        System.out.println("метод returnNewFloat вернул: " + trainMethodsReturn.returnNewFloat(7.5f));
        System.out.println("метод returnNewDouble вернул: " + trainMethodsReturn.returnNewDouble(7.7));
        System.out.println("метод returnNewShort вернул: " + trainMethodsReturn.returnNewShort((short) 1));
        System.out.println("метод returnNewByte вернул: " + trainMethodsReturn.returnNewByte((byte) 2));
        System.out.println("метож returnNewBoolean вернул: " + trainMethodsReturn.returnNewBoolean(true));
    }
}
