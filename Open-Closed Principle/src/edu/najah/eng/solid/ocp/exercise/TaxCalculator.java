package edu.najah.eng.solid.ocp.exercise;

import edu.najah.eng.solid.ocp.exercise.tax.UKTax;
import edu.najah.eng.solid.ocp.exercise.tax.USATax;

public class TaxCalculator {

    public Double calculateTax(Double amount,Country country) {
        Double taxAmount = 0.0;
        switch(country) {
            case USA:
                USATax usaTax = new USATax();//Factory
                taxAmount = usaTax.calculateTax(amount);
                break;
            case UK:
                UKTax ukTax = new UKTax();//Factory
                taxAmount = ukTax.calculateTax(amount);
                break;
            case IN:
                System.out.print("calculate tax as per India rules ");
                taxAmount += amount * 0.15;
                taxAmount += amount * 0.15;
                taxAmount += amount * 0.15;
                taxAmount += amount * 0.15;
                taxAmount += amount * 0.15;
                taxAmount += amount * 0.15;
                break;
            case JO:
                System.out.print("calculate tax as per JO rules ");
                taxAmount += amount * 0.05;
                taxAmount += amount * 0.05;
                taxAmount += amount * 0.05;
                taxAmount += amount * 0.05;
                taxAmount += amount * 0.05;
                taxAmount += amount * 0.05;
                break;
        }
        return taxAmount;
    }
}
