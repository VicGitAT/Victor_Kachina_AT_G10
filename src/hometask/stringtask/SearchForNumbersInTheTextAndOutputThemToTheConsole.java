package hometask.stringtask;

public class SearchForNumbersInTheTextAndOutputThemToTheConsole {

    public void searchAndPrintNumbersInString(String text) {
        String[] arrayCharText = text.split("");
        printArray(returnArrayInt(arrayCharText, countingDigitsInArray(arrayCharText)));
    }

    public int countingDigitsInArray(String[] array) {
        int counterNumber = 0;
        for (String s : array) {
            if (s.equalsIgnoreCase("0") | s.equalsIgnoreCase("1")
                    | s.equalsIgnoreCase("2") | s.equalsIgnoreCase("3")
                    | s.equalsIgnoreCase("4") | s.equalsIgnoreCase("5")
                    | s.equalsIgnoreCase("6") | s.equalsIgnoreCase("7")
                    | s.equalsIgnoreCase("8") | s.equalsIgnoreCase("9")) {
                counterNumber++;
            }
        }
        return counterNumber;
    }

    public int[] returnArrayInt(String[] array, int digitsNumber) {
        int[] arrayNumber = new int[digitsNumber];
        int numberPosition = 0;
        for (String s : array) {
            if (s.equalsIgnoreCase("0") | s.equalsIgnoreCase("1")
                    | s.equalsIgnoreCase("2") | s.equalsIgnoreCase("3")
                    | s.equalsIgnoreCase("4") | s.equalsIgnoreCase("5")
                    | s.equalsIgnoreCase("6") | s.equalsIgnoreCase("7")
                    | s.equalsIgnoreCase("8") | s.equalsIgnoreCase("9")) {
                arrayNumber[numberPosition] = Integer.parseInt(s);
                numberPosition++;
            }
        }
        return arrayNumber;
    }

    public void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

}
