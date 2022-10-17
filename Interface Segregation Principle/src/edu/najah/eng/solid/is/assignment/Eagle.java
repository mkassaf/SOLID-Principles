package edu.najah.eng.solid.is.assignment;

import edu.najah.eng.solid.is.assignment.intrf.Flyable;

public class Eagle implements Flyable {

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt() {

        this.numberOfFeathers -= 1;
    }
}
