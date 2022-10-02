package edu.najah.eng.solid.di.exercise;

import edu.najah.eng.solid.di.exercise.devices.Keyboard;
import edu.najah.eng.solid.di.exercise.devices.Monitor;

public class WindowsMachine {

    public final Keyboard keyboard;
    public final Monitor monitor;

    public WindowsMachine(){
        monitor = new Monitor();  //instance of monitor class
        keyboard = new Keyboard(); //instance of keyboard class
    }



}
