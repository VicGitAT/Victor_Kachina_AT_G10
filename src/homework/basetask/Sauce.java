package homework.basetask;

public class Sauce {

    private String sauceName;
    private String sauceColor;

    public Sauce(String sauceName, String sauceColor) {
        this.sauceName = sauceName;
        this.sauceColor = sauceColor;
    }

    public String getSauceName() {
        return sauceName;
    }

    public void setSauceName(String sauceName) {
        this.sauceName = sauceName;
    }

    public String getSauceColor() {
        return sauceColor;
    }

    public void setSauceColor(String sauceColor) {
        this.sauceColor = sauceColor;
    }

    public void printSauceDetails() {
        System.out.println("Это соус " + sauceName + " " + sauceColor + " цвета");
    }
}
