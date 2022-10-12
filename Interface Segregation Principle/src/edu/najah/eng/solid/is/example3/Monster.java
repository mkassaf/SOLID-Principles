package edu.najah.eng.solid.is.example3;

public class Monster implements Movable, Renderer, NoiseMaker {

    @Override
    public void move(){
        System.out.println("Move ...");
    }

    @Override
    public void render(){
        System.out.println("Render ...");
    }

    @Override
    public void makeNoise(){
        System.out.println("Noise ...");
    }
}
