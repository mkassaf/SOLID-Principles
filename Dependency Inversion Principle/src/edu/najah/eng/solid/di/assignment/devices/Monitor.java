package edu.najah.eng.solid.di.assignment.devices;

public class Monitor {

    public void turnOn(){ 
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void turnOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }

}
//solution 

public interface PowercanSwitch {
    void turnOn();
    void turnOff();
}
public class Monitor implements PowercanSwitch {
    @Override
    public void turnOn() {
          System.out.println("Turn on " + this.getClass().getName());
    }

    @Override
    public void turnOff() {
         System.out.println("Turn off " + this.getClass().getName());
    }
}
