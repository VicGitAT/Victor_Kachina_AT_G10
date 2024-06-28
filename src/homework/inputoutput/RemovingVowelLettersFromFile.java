package homework.inputoutput;

import java.io.*;

public class RemovingVowelLettersFromFile {

    public static void main(String[] args) {
        RemovingVowelLettersFromFile removingVowelLettersFromFile = new RemovingVowelLettersFromFile();
        removingVowelLettersFromFile.printArrayStringToFile(removingVowelLettersFromFile.returnArrayWithoutVowels("C:\\Users\\Vic\\Desktop\\file.txt"), "C:\\Users\\Vic\\Desktop\\file.txt");
    }

    public void printArrayStringToFile(String[] array, String pathFile) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));
            for (String s : array) {
                bufferedWriter.write(s + "\n");
            }
            bufferedWriter.close();
        }  catch (IOException e) {
            System.out.println(e + " Please try again");
        }
    }

    public String[] returnArrayWithoutVowels(String pathFile) {

        int counter = 0;
        int counterArray = 0;
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            while (bufferedReader.readLine() != null) {
                counter++;
            }
            bufferedReader.close();
        } catch (IOException p) {
            System.out.println(p + " Please try again");
        }

        String[] array = new String[counter];

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            while ((line = bufferedReader.readLine()) != null) {
                array[counterArray] = findingAndDeletingVowelsInString(line);
                counterArray++;
            }
        } catch (IOException e) {
            System.out.println(e + " Please try again");
        }

        return array;
    }

    public String findingAndDeletingVowelsInString(String line) {
        String[] lineArray = line.split("");
        for (int i = 0; i < lineArray.length; i++) {
            if (lineArray[i].matches("[аеёиоуыэюяАЕЁИОУЭЮЯaeiuyoAEIUYO]")) {
                lineArray[i] = " ";
            }
        }
        return String.join("", lineArray);
    }

}
