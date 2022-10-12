package edu.najah.eng.solid.di.assignment.devices;

public class Keyboard {
    public void powerOn(){
        System.out.println("Power on " + this.getClass().getName());
    }

    public void powerOff(){
        System.out.println("Power off " + this.getClass().getName());
    }
}
