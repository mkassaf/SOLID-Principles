package edu.najah.eng.solid.is.example.good;

import edu.najah.eng.solid.is.example.good.types.MyChar;
import edu.najah.eng.solid.is.example.good.types.MyInteger;

public class Main {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('A');
        MyInteger myInt = new MyInteger(44);

        try{
            System.out.println(myChar.convertToString());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(myInt.convertToChar());
            System.out.println(myInt.convertToDouble());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
