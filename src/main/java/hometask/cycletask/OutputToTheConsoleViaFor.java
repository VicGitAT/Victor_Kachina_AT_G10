package main.java.hometask.cycletask;

public class OutputToTheConsoleViaFor {

    public void outputViaFor() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
