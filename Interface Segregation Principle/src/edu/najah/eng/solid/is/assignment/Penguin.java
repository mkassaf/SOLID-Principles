package edu.najah.eng.solid.is.assignment;

public class Penguin implements BirdCanswim,  BirdMolt  {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
// since the Penguin cant fly we can delete and dont impements the fly() fun
    // public void fly() {
    //     System.err.println("Unsupported Operation Exception");
    //     throw new UnsupportedOperationException();
    // }

    public void swim() {

        this.currentLocation = "in the water";
    }
}
