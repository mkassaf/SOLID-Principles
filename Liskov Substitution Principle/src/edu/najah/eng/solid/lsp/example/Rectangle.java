package edu.najah.eng.solid.lsp.example;

public class Rectangle extends Shape2D {


    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }







}
