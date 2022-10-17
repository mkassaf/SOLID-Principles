package edu.najah.eng.solid.is.assignment;

import edu.najah.eng.solid.is.assignment.intrf.Swimable;

public class Penguin implements Swimable {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
