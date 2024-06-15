package homework.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int variable) {
        if (variable < 8) {
            return variable * 7;
        }
        return variable / 4;
    }

    public long returnNewLong(long variable) {
        if (variable > 300) {
            return variable - 300;
        }
        return variable + 20;
    }

    public String returnNewChar(char variable) {
        if (variable == 'g') {
            return variable + "o";
        }
        return "o" + variable;
    }

    public float returnNewFloat(float variable) {
        if (variable == 0.67) {
            return variable;
        }
        return variable * 2;
    }

    public double returnNewDouble(double variable) {
        if (variable > 30 & variable < 80) {
            return variable + 87;
        } else if (variable > 80 & variable < 400) {
            return variable - 87;
        } else if (variable > 400) {
            return variable / 4;
        }
        return variable;
    }

    public void returnNewBoolean(boolean variable) {
        if (variable) {
            System.out.println(" получил на вход значение истины");
        } else {
            System.out.println("я получил на вход лож");
        }
    }
}
