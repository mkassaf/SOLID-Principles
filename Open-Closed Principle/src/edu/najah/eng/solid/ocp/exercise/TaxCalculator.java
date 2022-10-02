package edu.najah.eng.solid.ocp.exercise;

public class TaxCalculator {

    public Double calculateTax(Double amount,Country country) {
        Double taxAmount = 0.0;
        switch(country) {
            case USA:
                System.out.print("calculate tax as per USA rules ");
                taxAmount = amount * 0.2;
                break;
            case UK:
                System.out.print("calculate tax as per UK rules ");
                taxAmount = amount * 0.3;
                break;
            case IN:
                System.out.print("calculate tax as per India rules ");
                taxAmount = amount * 0.15;
                break;
            default:
                System.out.print("This country is not supported ");
        }
        return taxAmount;
    }
}
