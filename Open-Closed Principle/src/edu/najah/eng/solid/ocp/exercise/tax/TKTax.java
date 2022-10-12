package edu.najah.eng.solid.ocp.exercise.tax;

public class TKTax extends GeneralTax implements Taxable{

    public double calculateTax(double amount){

        double taxAmount = super.calculateTax(amount);

        System.out.print("calculate tax as per TK rules ");
        taxAmount += amount * 0.18;

        return taxAmount;
    }
}
