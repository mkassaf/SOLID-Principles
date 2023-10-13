package edu.najah.eng.solid.is.assignment;

public class Eagle implements BirdCanfly,BirdCanswim,  BirdMolt 
{

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
