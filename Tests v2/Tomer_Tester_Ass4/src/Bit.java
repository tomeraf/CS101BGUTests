//---Write your code below row 51 only!!! Do not change anything above row 51!!-------------------------
public class Bit {

    private  boolean value;
    public static  final Bit ONE  = new Bit(true);
    public static  final Bit ZERO = new Bit(false);

    public Bit(boolean value) {
        this.value = value;
    }

    public Bit(int intValue) {
        if (intValue == 0)
            value = false;
        else {
            if (intValue == 1)
                value = true;
            else throw new IllegalArgumentException(intValue + " is neither 0 nor 1.");
        }
    }

    public String toString() {
        return "" + toInt();
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Bit))
            return false;
        else return value == ((Bit) obj).value;
    }

    public int toInt() {
        int output;
        if(value)
            output = 1;
        else
            output = 0;
        return output;
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 1.1 ================================================
    //--------------Write your code below this line only-----------------------------------------------------------
    public static Bit fullAdderSum(Bit bit1, Bit bit2, Bit bit3) {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

    public static Bit fullAdderCarry(Bit bit1, Bit bit2, Bit bit3) {
        throw new UnsupportedOperationException("Delete this line and implement the method.");
    }

}
