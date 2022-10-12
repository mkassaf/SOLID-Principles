package edu.najah.eng.solid.ocp.exercise.tax;

public class USATax extends GeneralTax {


    public double calculateTax(double amount){

        double taxAmount = super.calculateTax(amount);

        System.out.print("calculate tax as per USA rules ");
        taxAmount += amount * 0.2;

        return taxAmount;
    }



}
