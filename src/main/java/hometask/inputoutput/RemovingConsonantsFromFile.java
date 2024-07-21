package main.java.hometask.inputoutput;

import java.io.*;
import java.util.ArrayList;

public class RemovingConsonantsFromFile {

    public static void main(String[] args) {
        printArrayListStringToFile(readingFileAndReturningCollectionStringsWithoutConsonants("C:\\Users\\Vic\\Desktop\\file.txt"), "C:\\Users\\Vic\\Desktop\\file.txt");
    }

    public static void printArrayListStringToFile(ArrayList<String> listWithoutConsonants, String fileToWrite) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, true));
            bufferedWriter.write("\n\n");
            for (String str : listWithoutConsonants) {
                bufferedWriter.write(str + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e + " please try again");
        }
    }

    public static ArrayList<String> readingFileAndReturningCollectionStringsWithoutConsonants(String fileToRead) {
        ArrayList<String> fileTextInList = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToRead));
            while ((line = bufferedReader.readLine()) != null) {
                fileTextInList.add(findingAndDeletingVowelsInString(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e + " please try again");
        }
        return fileTextInList;
    }

    public static String findingAndDeletingVowelsInString(String line) {
        String[] lineArray = line.split("");
        for (int i = 0; i < lineArray.length; i++) {
            if (!lineArray[i].matches("[аеёиоуыэюяАЕЁИОУЭЮЯaeiuyoAEIUYO]")) {
                lineArray[i] = " ";
            }
        }
        return String.join("", lineArray);
    }


}
