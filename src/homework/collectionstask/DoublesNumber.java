package homework.collectionstask;

import java.util.ArrayList;
import java.util.List;

public class DoublesNumber {

    public List<Double> listNumber() {
        List<Double> number = new ArrayList<>();
        number.add(33.42);
        number.add(34.3);
        number.add(0.79);
        number.add(2.3426);
        number.add(6.8);
        number.add(13.24);
        number.add(5.5);
        number.add(769.9);
        return number;
    }

    public void printListNumbers(List<Double> number) {
        for (Double variable : number) {
            System.out.print(number + " ");
        }
    }

    public void printMultiplicationListNumber(List<Double> number) {
        double multiplication = 1;
        for (Double variable : number) {
            multiplication *= variable;
        }
        System.out.println("the product of the collection elements is equal to " + multiplication);

        double a = 1.5;
        int f = (int) a;


    }

    public void sumFractionalParts(List<Double> number) {
        double sum = 0;
        for (Double variable : number) {
            double var = variable;
            int wholePart = (int) var;
            sum += variable - wholePart;
        }
        System.out.println("the sum of the fractional parts is equal to " +sum);
    }

    public void printWholeParts(List<Double> number) {
        for (int i = 0; i < number.size(); i++) {
            double var = number.get(i);
            int wholePart = (int) var;
            System.out.print(wholePart + " ");
        }
    }

}
