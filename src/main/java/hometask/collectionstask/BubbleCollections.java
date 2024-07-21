package main.java.hometask.collectionstask;

import main.java.hometask.collectionstask.objectfortask.Bubble;

import java.util.ArrayList;
import java.util.List;

public class BubbleCollections {

    public List<Bubble> listBubble() {
        List<Bubble> bubble = new ArrayList<>();
        bubble.add(new Bubble(2, "CO2"));
        bubble.add(new Bubble(4, "O2"));
        bubble.add(new Bubble(5, "CO"));
        return bubble;
    }

    public void printVolume(List<Bubble> bubble) {
        for (Bubble bubble1 : bubble) {
            System.out.println(bubble1.getVolume() + " ");
        }
    }

    public void printName(List<Bubble> bubble) {
        for (Bubble bubble1 : bubble) {
            System.out.println(bubble1.getName() + " ");
        }
    }

    public void printVolumeAllBubbles(List<Bubble> bubble) {
        int counterVolume = 0;
        for (Bubble bubble1 : bubble) {
            counterVolume += bubble1.getVolume();
        }
        System.out.println("the volume of all bubbles is equal to " + counterVolume);
    }

    public void printBubbles(List<Bubble> bubble) {
        for (Bubble bubble1 : bubble) {
            System.out.println(bubble1.toString());
        }
    }
}
