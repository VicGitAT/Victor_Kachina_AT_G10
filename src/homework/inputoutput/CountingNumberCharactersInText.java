package homework.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class CountingNumberCharactersInText {

    public static void main(String[] args) {
        new CountingNumberCharactersInText().readingFileAndOutputtingNumberCharactersInIt("C:\\Users\\Vic\\Desktop\\file.txt");
    }

    public void readingFileAndOutputtingNumberCharactersInIt(String pathFile) {
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            System.out.println(e + " please try again");
        }
        System.out.println(text.toString().split("").length);
    }
}
