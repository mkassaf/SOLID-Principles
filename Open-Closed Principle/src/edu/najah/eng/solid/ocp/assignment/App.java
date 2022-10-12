package edu.najah.eng.solid.ocp.assignment;

public class App {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        calculator.addNumber(1);
        calculator.addNumber(3);
        calculator.addNumber(5);
        calculator.addNumber(2);
        calculator.addNumber(9);
        calculator.addNumber(1);

        System.out.println("Addition " + calculator.getOperationResult(Operation.Addition));
        System.out.println("Multiplication " + calculator.getOperationResult(Operation.Multiplication));
        System.out.println("Count " + calculator.getOperationResult(Operation.Count));
        System.out.println("Max " + calculator.getOperationResult(Operation.Max));
        System.out.println("Min " + calculator.getOperationResult(Operation.Min));
    }
}
