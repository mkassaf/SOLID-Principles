package edu.najah.eng.solid.is.example.bad;

import edu.najah.eng.solid.is.example.bad.intf.Conversion;
import edu.najah.eng.solid.is.example.bad.types.MyChar;
import edu.najah.eng.solid.is.example.bad.types.MyInteger;

public class Main {
    public static void main(String[] args) {
        Conversion myChar = new MyChar('A');
        Conversion myInt = new MyInteger(44);

        try{
            System.out.println(myChar.charToString());
            System.out.println(myChar.intToChar());
            System.out.println(myChar.intToDouble());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(myInt.intToChar());
            System.out.println(myInt.intToDouble());
            System.out.println(myInt.charToString());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
