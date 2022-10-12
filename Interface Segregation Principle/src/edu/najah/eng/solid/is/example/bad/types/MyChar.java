package edu.najah.eng.solid.is.example.bad.types;

import edu.najah.eng.solid.is.example.bad.intf.Conversion;

public class MyChar implements Conversion {

    private char value;

    public MyChar(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public double intToDouble() {
        System.err.println("Unsupported Operation ");
        throw new UnsupportedOperationException();
    }

    @Override
    public char intToChar() {
        System.err.println("Unsupported Operation ");
        throw new UnsupportedOperationException();
    }

    @Override
    public String charToString() {
        return String.valueOf(value);
    }
}
