package edu.najah.eng.solid.ocp.exercise.tax;

public class UKTax extends GeneralTax{

    public double calculateTax(double amount){

        double taxAmount = super.calculateTax(amount);

        System.out.print("calculate tax as per UK rules ");
        taxAmount += amount * 0.3;

        return taxAmount;
    }
}
