package homework.collectionstask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntNumbers {

    public List<Integer> listNumber() {
        List<Integer> number = new ArrayList<>();
        number.add(3342);
        number.add(34);
        number.add(79);
        number.add(23426);
        number.add(68);
        number.add(1324);
        number.add(55);
        number.add(7699);
        return number;
    }

    public void printListNumbers(List<Integer> numbers) {
        for (Integer variable : numbers) {
            System.out.println(variable);
        }
    }

    public void printSumListNumber(List<Integer> numbers) {
        int sum = 0;
        for (Integer variable : numbers) {
            sum += variable;
        }
        System.out.println("sum listNumber = " + sum);
    }

    public void sortListNumber(List<Integer> numbers) {
        Collections.sort(numbers);
        for (Integer variable : numbers) {
            System.out.println(variable);
        }
    }

    public void printListNumberViaIndex(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers + " ");
        }
    }

    public void reversListNumber(List<Integer> numbers) {
        Collections.reverse(numbers);
        for (Integer variable : numbers) {
            System.out.println(variable);
        }
    }


}
