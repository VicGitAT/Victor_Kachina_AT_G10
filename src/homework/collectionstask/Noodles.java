package homework.collectionstask;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public List<String> listNoodles() {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");
        return noodles;
    }

    public void printListNoodles(List<String> noodles) {
        for (String str : noodles) {
            System.out.print(str + " ");
        }
    }

    public void replacingCharacters(List<String> noodles, char replacedCharacter, char symbolToReplace) {
        for (int i = 0; i < noodles.size(); i++) {
            String strForReplacing = noodles.get(i).replace(replacedCharacter, symbolToReplace);
            noodles.set(i, strForReplacing);
            System.out.print(noodles.get(i) + " ");
        }
    }
}
