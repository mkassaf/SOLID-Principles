package edu.najah.eng.solid.lsp.example;

public class Square extends Rectangle {


    public Square(double height, double weight) {
        super(height, weight);
    }


    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWeight(height);
    }

    @Override
    public void setWeight(double weight) {
        super.setHeight(weight);
        super.setWeight(weight);
    }
}
