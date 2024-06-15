package homework.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int variable) {
        return variable * 3;
    }

    public long returnNewLong(long variable) {
        return variable - 4;
    }

    public String returnNewChar(char variable) {
        return variable + " " + variable;
    }

    public float returnNewFloat(float variable) {
        return variable / 2;
    }

    public double returnNewDouble(double variable) {
        return variable + 8;
    }

    public short returnNewShort(short variable) {
        return (short) (variable - 1);
    }

    public byte returnNewByte(byte variable) {
        return (byte) (variable * 2);
    }

    public boolean returnNewBoolean(boolean variable) {
        return !variable;
    }
}
