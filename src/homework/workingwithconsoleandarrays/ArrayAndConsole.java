package homework.workingwithconsoleandarrays;

import java.util.Random;

public class ArrayAndConsole {

    public static void main(String[] args) {
        ArrayAndConsole arrayAndConsole = new ArrayAndConsole();
        int[] arrayForTask = arrayAndConsole.returnRandomArray();
        System.out.println("Массив для выполнения заданий:");
        arrayAndConsole.printArray(arrayForTask);
        arrayAndConsole.outputSumNthElementsArray(arrayForTask, 10);
        System.out.println("Массив, состоящий из элементов исходного массива больше переменной и выведены в обратном порядке:");
        arrayAndConsole.printArray(arrayAndConsole.returnArrayWithElementsLargerThanVariableInReverseOrder(arrayForTask, 20));
        System.out.println("\nсумма элементов массива кратных первой цифре длины этого массива равна: " + arrayAndConsole.sumArrayElementsThatAreMultiplesFirstDigitArrayLength(arrayForTask) + ".\n");
        arrayAndConsole.printCow();
    }

    public int[] returnRandomArray() {
        Random random = new Random();
        int[] randomArray = new int[random.nextInt(30)];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    public void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public void outputSumNthElementsArray(int[] array, int variable) {
        if (variable < array.length && variable > 0) {
            System.out.println("\nсумма каждого " + variable + " элемента массива равна: " + calculationSumNthElementsArray(array, variable) + ".\n");
        } else {
            System.out.println("\nнайти сумму каждого " + variable + "-го элемента массива невозможно т.к. переменная variable должна быть больше нуля, но меньше длинны массива: " + array.length + ".\n");
        }
    }

    public int calculationSumNthElementsArray(int[] array, int variable) {
        int sum = 0;
        for (int i = variable - 1; i < array.length; i += variable) {
            sum += array[i];
        }
        return sum;
    }

    public int[] returnArrayWithElementsLargerThanVariableInReverseOrder(int[] array, int variableForComparisons) {
        int counterArrayLength = countingNumberArrayIsMoreThanVariable(array, variableForComparisons);
        if (counterArrayLength == 0) {
            System.out.println("среди элементов массива нет значений больше " + variableForComparisons + ", возвращаю исходный массив.");
            return array;
        }
        int[] newArray = new int[counterArrayLength];
        returnArrayWithElementsThatAreMoreThenVariableInReverseOrder(array, newArray, variableForComparisons);
        return newArray;
    }

    public int countingNumberArrayIsMoreThanVariable(int[] array, int variableForComparisons) {
        int counterArrayLength = 0;
        for (int j : array) {
            if (j > variableForComparisons) {
                counterArrayLength++;
            }
        }
        return counterArrayLength;
    }

    public void returnArrayWithElementsThatAreMoreThenVariableInReverseOrder(int[] array, int[] newArray, int variableForComparisons) {
        for (int i = 0, k = newArray.length - 1; i < array.length; i++) {
            if (array[i] > variableForComparisons) {
                newArray[k] = array[i];
                k--;
            }
        }
    }

    public int sumArrayElementsThatAreMultiplesFirstDigitArrayLength(int[] array) {
        return countingSumArrayElementsThatAreMultiplesVariable(array, searchingForTheFirstNumberArrayLength(array));
    }

    public int searchingForTheFirstNumberArrayLength(int[] array) {
        int firstNumberLengthArray = 0;
        if (array.length < 10 & array.length > 0) {
            firstNumberLengthArray = array.length;
        } else if (array.length > 10) {
            firstNumberLengthArray = array.length;
            while (firstNumberLengthArray > 10) {
                firstNumberLengthArray = firstNumberLengthArray / 10;
            }
        }
        return firstNumberLengthArray;
    }

    public int countingSumArrayElementsThatAreMultiplesVariable(int[] array, int firstNumberLengthArray) {
        int sum = 0;
        for (int j : array) {
            if (j % firstNumberLengthArray == 0) {
                sum += j;
            }
        }
        return sum;
    }

    public void printCow() {
        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
    }
}
