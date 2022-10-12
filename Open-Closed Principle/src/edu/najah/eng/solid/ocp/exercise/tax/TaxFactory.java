package edu.najah.eng.solid.ocp.exercise.tax;

import edu.najah.eng.solid.ocp.exercise.Country;

public class TaxFactory {


    public static GeneralTax getInstance(Country country){

        if (country.equals(Country.EGY)){
            return new EGYTax();
        }
        if (country.equals(Country.USA)){
            return new USATax();
        }
        if (country.equals(Country.UK)){
            return new UKTax();
        }

        return new GeneralTax();

    }
}
