package edu.najah.eng.solid.di.assignment;

import edu.najah.eng.solid.di.assignment.devices.Keyboard;
import edu.najah.eng.solid.di.assignment.devices.Monitor;

public class WindowsMachine {

    public final Keyboard keyboard;
    public final Monitor monitor;

    public WindowsMachine(){
        monitor = new Monitor();  //instance of monitor class
        keyboard = new Keyboard(); //instance of keyboard class
    }


    public void changeKeyboardStatus(boolean status){
        if (status){
            keyboard.powerOn();
        } else {
            keyboard.powerOff();
        }
    }

    public void changeMonitorStatus(boolean status){
        if (status){
            monitor.turnOn();
        } else {
            monitor.turnOff();
        }
    }



}
