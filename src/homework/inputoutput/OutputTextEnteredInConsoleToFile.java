package homework.inputoutput;

import java.io.*;

public class OutputTextEnteredInConsoleToFile {

    public String readConsole() {
        String message;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            message = bufferedReader.readLine();
            bufferedReader.close();
            return message;
        } catch (IOException e) {
            return e + " Please try again";
        }
    }

    public void writingToFile(String message) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Vic\\Desktop\\file.txt"));
            out.write(message);
            out.close();
        } catch (IOException e) {
            System.out.println(e + " Please try again");
        }
    }

    public static void main(String[] args) {
        OutputTextEnteredInConsoleToFile outputTextEnteredInConsoleToFile = new OutputTextEnteredInConsoleToFile();
        outputTextEnteredInConsoleToFile.writingToFile(outputTextEnteredInConsoleToFile.readConsole());
    }
}
