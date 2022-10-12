package edu.najah.eng.solid.ocp.exercise.tax;

public class USTOutSideTax extends USATax{

    @Override
    public double calculateTax(double amount){

        if (amount > 100000){
            amount = amount - 100000;
        }
        double taxAmount = super.calculateTax(amount);//USATax

        return taxAmount;
    }
}
