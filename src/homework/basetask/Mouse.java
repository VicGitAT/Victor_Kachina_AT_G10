package homework.basetask;

public class Mouse {

    private String mouseName;
    private int mouseAge;

    public Mouse(String mouseName, int mouseAge) {
        this.mouseName = mouseName;
        this.mouseAge = mouseAge;
    }

    public String getMouseName() {
        return mouseName;
    }

    public void setMouseName(String mouseName) {
        this.mouseName = mouseName;
    }

    public int getMouseAge() {
        return mouseAge;
    }

    public void setMouseAge(int mouseAge) {
        this.mouseAge = mouseAge;
    }

    public void printMouseDetails() {
        System.out.println("я мышь, меня зовут " + mouseName + " и мне " + mouseAge);
    }
}
