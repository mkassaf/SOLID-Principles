package edu.najah.eng.solid.lsp.example;

public abstract class Shape2D {

    private double height;
    private double width;

    public Shape2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double getArea();

}
