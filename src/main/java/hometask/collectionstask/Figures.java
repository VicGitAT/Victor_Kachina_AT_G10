package main.java.hometask.collectionstask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Figures {

    public List<String> listFigures() {
        List<String> figures = new ArrayList<>();
        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");
        return figures;
    }

    public void printListFiguresInFile(List<String> figures) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Vic\\Desktop\\figures.txt", true));
            for (String str : figures) {
                bufferedWriter.write(str + "-");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e + "please try again");
        }
    }

    public void printFiguresWithoutLetterИInName(List<String> figures) {
        int counterLetterИ = 0;
        for (String str : figures) {
            if (!str.contains("и") && !str.contains("И")) {
                counterLetterИ++;
            }
        }
        System.out.println(counterLetterИ + " figures without the letter 'И' in the name");
    }

    public void printFiguresViaIndex(List<String> figures) {
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
    }

    public void addingTriangleToThirdPositionAndPrinting(List<String> figures) {
        figures.add(2, "Треугольник");
        for (String str : figures) {
            System.out.print(str + " ");
        }
    }
}
