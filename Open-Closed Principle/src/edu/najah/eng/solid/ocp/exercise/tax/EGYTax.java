package edu.najah.eng.solid.ocp.exercise.tax;

public class EGYTax extends  GeneralTax {

    public double calculateTax(double amount){

        double taxAmount = super.calculateTax(amount);

        System.out.print("calculate tax as per EGY rules ");
        taxAmount += amount * 0.012;

        return taxAmount;
    }
}
