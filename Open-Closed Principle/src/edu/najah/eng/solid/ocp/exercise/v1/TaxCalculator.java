package edu.najah.eng.solid.ocp.exercise.v1;

import edu.najah.eng.solid.ocp.exercise.Country;
import edu.najah.eng.solid.ocp.exercise.tax.GeneralTax;
import edu.najah.eng.solid.ocp.exercise.tax.TaxFactory;
import edu.najah.eng.solid.ocp.exercise.tax.UKTax;
import edu.najah.eng.solid.ocp.exercise.tax.USATax;

public class TaxCalculator {


    private GeneralTax myTaxCalculator = null;

    public TaxCalculator(){
        myTaxCalculator = new GeneralTax();
    }
    @Deprecated
    public Double calculateTax(Double amount, Country country) {
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


    @Deprecated
    public Double calculateTaxUsingFactory(Double amount,Country country) {
        GeneralTax taxCalculator = TaxFactory.getInstance(country);
        return taxCalculator.calculateTax(amount);
    }

    public Double calculateTax(Double amount,GeneralTax taxCalculator) {
        return taxCalculator.calculateTax(amount);
    }

    public Double calculateTaxUsingComposition(Double amount) {
        return myTaxCalculator.calculateTax(amount);
    }

    public GeneralTax getMyTaxCalculator() {
        return myTaxCalculator;
    }

    public void setMyTaxCalculator(GeneralTax myTaxCalculator) {
        this.myTaxCalculator = myTaxCalculator;
    }
}
