package edu.najah.eng.solid.is.example.bad.types;

import edu.najah.eng.solid.is.example.bad.intf.Conversion;

public class MyInteger implements Conversion {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public double intToDouble() {
        return (double)value;
    }

    @Override
    public char intToChar() {
        return (char)value;
    }

    @Override
    public String charToString() {
        System.err.println("Unsupported Operation ");
        throw new UnsupportedOperationException();
    }
}
