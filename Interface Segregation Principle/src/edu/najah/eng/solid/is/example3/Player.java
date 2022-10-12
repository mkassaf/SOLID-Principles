package edu.najah.eng.solid.is.example3;

public class Player implements Movable, Renderer {


    @Override
    public void move(){
        System.out.println("Move ...");
    }

    @Override
    public void render(){
        System.out.println("Render ...");
    }

}
