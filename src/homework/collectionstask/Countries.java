package homework.collectionstask;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public List<String> listCountries() {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        return countries;
    }

    public void printCountriesViaCommaAndSpase(List<String> countries) {
        for (String str : countries) {
            System.out.print(str + ", ");
        }
    }

    public void printingCountriesWithLessThanSevenLettersInTheirName(List<String> countries) {
        for (String str : countries) {
            if (str.length() < 7) {
                System.out.println(str);
            }
        }
    }

    public void printCountriesViaIndex(List<String> countries) {
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }

}
