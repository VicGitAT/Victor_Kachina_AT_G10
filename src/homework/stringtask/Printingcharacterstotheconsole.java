package homework.stringtask;

public class Printingcharacterstotheconsole {

    public void printChar(String text){
        String[] charText = text.split("");
        for (String j : charText){
            System.out.println(j);
        }
    }
}
