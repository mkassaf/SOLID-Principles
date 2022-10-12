package edu.najah.eng.solid.lsp.example;

public class Main {

    public static void main(String[] args) {

        Shape2D rectangle = new Rectangle(5,5);
        Shape2D rectangle2 = new Square(5,4);

        //Rectangle square = new Rectangle(5,5);
        //Rectangle square2 = new Square(5,5);

        Square square1 = new Square(5);
        square1.setHeight(4);//width => 4

        System.out.println(rectangle.getArea());//25
        System.out.println(square1.getArea());//25 -> 16


        System.out.println(rectangle2.getArea());//25

    }
}
