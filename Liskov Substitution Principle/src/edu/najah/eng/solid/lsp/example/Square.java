package edu.najah.eng.solid.lsp.example;

public class Square extends Shape2D {


    public Square(double height, double width) {
        super(height, height);
        if (height != width){
            System.err.println("In square can't have height != width, in my can i use the height");
        }

    }

    public Square(double length) {
        super(length, length);
    }


    @Override
    public void setHeight(double height) {
        super.setHeight(height);//no change
        super.setWidth(height);// new
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);//
        super.setHeight(width);// new
    }

    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }


}
