package hometask.cycletask;

public class ChangeNumberPositionFirstAndLastElementArray {

    public void changeNumberPosition(int[] array) {
        int variableForChangePosition;
        variableForChangePosition = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = variableForChangePosition;
        for (int j : array) {
            System.out.println(j);
        }
    }
}
