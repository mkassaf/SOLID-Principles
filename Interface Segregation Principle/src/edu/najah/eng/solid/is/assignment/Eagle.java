package edu.najah.eng.solid.is.assignment;

public class Eagle implements Bird {

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {

        this.numberOfFeathers -= 1;
    }

    @Override
    public void swim() {
        System.err.println("Unsupported Operation Exception");
        throw new UnsupportedOperationException();
    }

}
