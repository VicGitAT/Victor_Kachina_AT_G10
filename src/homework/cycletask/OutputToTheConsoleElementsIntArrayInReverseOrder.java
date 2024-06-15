package homework.cycletask;

public class OutputToTheConsoleElementsIntArrayInReverseOrder {

    public void outputToConsoleInRevers(int[] array) {
        int variableForChangePosition;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            variableForChangePosition = array[i];
            array[i] = array[j];
            array[j] = variableForChangePosition;
        }
        for (int j : array) {
            System.out.println(j);
        }
    }

}
