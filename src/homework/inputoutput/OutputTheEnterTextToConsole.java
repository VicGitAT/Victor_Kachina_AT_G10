package homework.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OutputTheEnterTextToConsole {

    public void outputToConsoleBufferedReader() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("Hello, I just got %s from you!\n", bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e + " Please try again");
        }
    }

    public void outputToConsoleScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello, I just got %s from you!\n", scanner.nextLine());
        scanner.close();
    }

    public static void main(String[] args) {
        new OutputTheEnterTextToConsole().outputToConsoleScanner();
    }
}
