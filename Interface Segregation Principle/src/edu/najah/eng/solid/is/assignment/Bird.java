package edu.najah.eng.solid.is.assignment;

public interface Bird {
    public void fly();
    public void molt();
    public void swim();
}
// i segregate the Brid interface into multiple interfaces
public interface BirdCanfly {
    public void fly();
}
public interface BirdCanswim {
    public void swim();
}
public interface BirdMolt {
    public void molt();
}
