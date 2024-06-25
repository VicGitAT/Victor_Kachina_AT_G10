package homework.collectionstask;

import java.util.ArrayList;
import java.util.List;

public class Birds {

    public List<String> listBirds() {
        List<String> birds = new ArrayList<>();
        birds.add("Чайка");
        birds.add("Дрозд");
        birds.add("Бусел");
        birds.add("Голубь");
        birds.add("Воробей");
        birds.add("Цапля");
        return birds;
    }

    public void printBirds(List<String> birds) {
        for (String str : birds) {
            System.out.println("--" + str + "--");
        }
    }

    public void birdCountWithTwoOrMoreVowels(List<String> birds) {
        int birdCounterWithTwoOrMoreVowels = 0;
        twoVowelsFound:
        for (String str : birds) {
            int counterVowels = 0;
            for (String charStr : str.split("")) {
                if (charStr.matches("[аеёиоуыэюяАЕЁИОУЭЮЯaeiuyoAEIUYO]")) {
                    counterVowels++;
                }
                if (counterVowels >= 2) {
                    birdCounterWithTwoOrMoreVowels++;
                    continue twoVowelsFound;
                }
            }
        }
        System.out.println(birdCounterWithTwoOrMoreVowels + " birds contain two or more vowels");
    }

    public void printBirdsViaIndex(List<String> birds) {
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
    }

    public void replacingThirdElementWithTit(List<String> birds) {
        birds.set(2, "Синица");
        for (String str : birds) {
            System.out.print(str + " ");
        }
    }


}
