package homework.stringtask;

public class SearchForDuplicates {

    public void searchForDuplicatesAndPrint(String text){
        String[] wordText = text.split(" ");
        for (int i = 0; i < wordText.length; i++) {
            if ()
            for (int j = i; j < wordText.length -1; j++) {
                if (wordText[i].equalsIgnoreCase(wordText[j + 1])){
                    System.out.println(wordText[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        SearchForDuplicates searchForDuplicates = new SearchForDuplicates();
        searchForDuplicates.searchForDuplicatesAndPrint("qdwdqw qqw dq qw dqwd d qwd qwd q");
    }
}
