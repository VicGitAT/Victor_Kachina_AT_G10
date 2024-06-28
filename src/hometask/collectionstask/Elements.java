package hometask.collectionstask;

import java.util.ArrayList;
import java.util.List;

public class Elements {

    public List<String> listElements() {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");
        return elements;
    }

    public void printElementViaSpase(List<String> elements) {
        for (String str : elements) {
            System.out.print(str + " ");
        }
    }

    public void countingElementsWithTwoOrMoreWordsInTheName(List<String> elements) {
        int counter = 0;
        for (String str : elements) {
            if (str.split("[ -]").length >= 2) {
                counter++;
            }
        }
        System.out.println(counter + " elements contain two or more words");
    }

    public void printElementsViaIndex(List<String> elements) {
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
    }

    public void addingRemovingReplacingElements(List<String> elements) {
        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");
        for (String str : elements)
            System.out.print(str + " ");
    }

}
