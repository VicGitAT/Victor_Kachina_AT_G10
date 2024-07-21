package main.java.hometask.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {
        FillingTheArray fillingTheArray = new FillingTheArray();
        PrintingSeparators printingSeparators = new PrintingSeparators();
        int[] array = fillingTheArray.returnIntArrayWithRandomNumbers();
        System.out.println("вывод в консоль чисел от 0 до 20 в строку через пробел:");
        new OutputToTheConsoleViaWhile().outputViaWhile();
        printingSeparators.printingSeparationLine();
        System.out.println("вывод в консоль нечетных чисел от 3 до 19:");
        new OutputToTheConsoleViaFor().outputViaFor();
        printingSeparators.printingSeparationLine();
        System.out.println("первоначальный массив для выполнения заданий:");
        new OutputOfArrayElementsToTheConsole().outputToConsole(array);
        printingSeparators.printingSeparationLine();
        System.out.println("найти минимальный элемент массива:");
        new FindingTheMinimumElementOfArray().findMinimumElement(array);
        printingSeparators.printingSeparationLine();
        System.out.println("умножить каждый элемент массива на переменную:");
        new OutputOfIntArrayElementsMultipliedByVariable().outputArrayMultipliedByVariable(array, 5);
        printingSeparators.printingSeparationLine();
        System.out.println("возвести каждый элемент массива в квадрат:");
        new OutputToConsoleOfSquaringArrayElements().squaringArrayElements(array);
        printingSeparators.printingSeparationLine();
        System.out.println("вывести элементы массива в обратном порядке:");
        new OutputToTheConsoleElementsIntArrayInReverseOrder().outputToConsoleInRevers(array);
        printingSeparators.printingSeparationLine();
        System.out.println("отсортировать массив по убыванию:");
        new SortArray().sortByMinimal(array);
        printingSeparators.printingSeparationLine();
        System.out.println("отсортировать массив по возрастанию");
        new SortArray().sortByMax(array);
        printingSeparators.printingSeparationLine();
        System.out.println("поменять местами первый и последний элемент массива: ");
        new ChangeNumberPositionFirstAndLastElementArray().changeNumberPosition(array);

    }
}
