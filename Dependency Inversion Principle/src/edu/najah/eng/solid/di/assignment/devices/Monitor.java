package edu.najah.eng.solid.di.assignment.devices;

public class Monitor {

    public void turnOn(){
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void turnOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }

}
