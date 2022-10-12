package edu.najah.eng.solid.ocp.exercise.v3;


import edu.najah.eng.solid.ocp.exercise.Country;
import edu.najah.eng.solid.ocp.exercise.tax.TKTax;

public class TaxCalculator extends edu.najah.eng.solid.ocp.exercise.v2.TaxCalculator {

    @Override
    public Double calculateTax(Double amount, Country country) {

        Double taxAmount = super.calculateTax(amount, country);
        if (taxAmount == 0){
            switch (country) {
                case TK : {
                    TKTax egyTax = new TKTax();
                    taxAmount += egyTax.calculateTax(amount);
                }
            }
        }
        return taxAmount;
    }


}
