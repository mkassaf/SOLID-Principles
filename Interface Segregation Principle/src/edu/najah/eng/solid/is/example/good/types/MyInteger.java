package edu.najah.eng.solid.is.example.good.types;

import edu.najah.eng.solid.is.example.good.conversion.CharConversion;
import edu.najah.eng.solid.is.example.good.conversion.DoubleConversion;

public class MyInteger implements DoubleConversion, CharConversion {

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
    public double convertToDouble() {
        return (double)value;
    }

    @Override
    public char convertToChar() {
        return (char)value;
    }
}
