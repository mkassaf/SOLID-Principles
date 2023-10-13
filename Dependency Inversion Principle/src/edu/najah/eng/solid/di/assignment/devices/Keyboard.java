package edu.najah.eng.solid.di.assignment.devices;
// The Dependency Inversion Principle (DIP) suggests that high-level modules should not depend on low-level modules; both should depend on
//     abstractions. In your code, the WindowsMachine class depends directly on concrete implementations of Keyboard and Monitor, violating the DIP. 
//     To resolve this, you can use dependency injection and introduce abstractions to decouple high-level modules from low-level modules.

public class Keyboard {
    public void powerOn(){
        System.out.println("Power on " + this.getClass().getName());
    }

    public void powerOff(){
        System.out.println("Power off " + this.getClass().getName());
    }
}
// solution 
public interface Keyboard {
    void powerOn();
    void powerOff();
}
