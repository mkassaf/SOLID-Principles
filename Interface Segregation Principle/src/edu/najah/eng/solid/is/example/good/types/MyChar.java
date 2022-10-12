package edu.najah.eng.solid.is.example.good.types;

import edu.najah.eng.solid.is.example.good.conversion.StringConversion;

public class MyChar implements StringConversion {

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
    public String convertToString() {
        return String.valueOf(value);
    }

}
