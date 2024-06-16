package homework.stringtask;

public class SearchEngineForDuplicateWordsInString {

    public void searchForDuplicateWords(String text) {
        String[] words = text.split(" ");

        thisWordHasAlreadyBeenEncountered:
        for (int i = 0; i < words.length; i++) {
            int counterWords = 1;

            for (int k = i - 1; k >= 0; k--) {
                if (words[i].equalsIgnoreCase(words[k])) {
                    continue thisWordHasAlreadyBeenEncountered;
                }
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    counterWords++;
                }
            }

            if (counterWords != 1) {
                System.out.println("слово " + words[i] + " встречается в строке " + counterWords + " раз(а).");
            }
        }
    }
}
