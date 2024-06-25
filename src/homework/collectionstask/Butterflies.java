package homework.collectionstask;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public List<String> listButterflies() {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
        return butterflies;
    }

    public void printButterfliesWithQuotationMarks(List<String> butterflies) {
        for (String str : butterflies) {
            System.out.println("\"" + str + "\"");
        }
    }

    public void printButterfliesWithLetterOInName(List<String> butterflies) {
        int counterLetterO = 0;
        for (String str : butterflies) {
            if (str.contains("o") || str.contains("O")) {
                counterLetterO++;
            }
        }
        System.out.println(counterLetterO + " butterflies with the letter O in the name");
    }

    public void printButterfliesViaIndex(List<String> butterflies) {
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
    }

    public void printButterfliesViaLineBreak(List<String> butterflies) {
        for (String str : butterflies) {
            System.out.print(str + "\n");
        }
    }
}
