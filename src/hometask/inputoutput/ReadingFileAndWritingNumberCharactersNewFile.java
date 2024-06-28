package hometask.inputoutput;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReadingFileAndWritingNumberCharactersNewFile {

    public static void main(String[] args) {
        ReadingFileAndWritingNumberCharactersNewFile readingFileAndWritingNumberCharactersNewFile = new ReadingFileAndWritingNumberCharactersNewFile();
        readingFileAndWritingNumberCharactersNewFile.printInNewFile(readingFileAndWritingNumberCharactersNewFile.returnNumberCharacters("C:\\Users\\Vic\\Desktop\\file.txt"));
    }

    public void printInNewFile(int numberCharacters) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d_MM_uuuu HH.mm.ss");
        String timeNow = now.format(formatter);
        String fileNameAndPath = "C:\\Users\\Vic\\Desktop\\" + timeNow + " number_characters_" + 10 +".txt";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNameAndPath));
            bufferedWriter.write("the read file contained " + numberCharacters + " characters");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e + "please try again");
        }
    }

    public int returnNumberCharacters(String pathFileForRead) {
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFileForRead));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            System.out.println(e + " please try again");
        }
        return text.toString().split("").length;
    }
}
