package edu.najah.eng.solid.is.assignment;

public class Penguin implements Bird {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void fly() {
        System.err.println("Unsupported Operation Exception");
        throw new UnsupportedOperationException();
    }

    public void swim() {

        this.currentLocation = "in the water";
    }
}
