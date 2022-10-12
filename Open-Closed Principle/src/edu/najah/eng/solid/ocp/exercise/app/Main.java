package edu.najah.eng.solid.ocp.exercise.app;

import edu.najah.eng.solid.ocp.exercise.Country;
import edu.najah.eng.solid.ocp.exercise.v1.TaxCalculator;
import edu.najah.eng.solid.ocp.exercise.tax.EGYTax;
import edu.najah.eng.solid.ocp.exercise.tax.UKTax;
import edu.najah.eng.solid.ocp.exercise.tax.USATax;

public class Main {

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculateTax(100.0, Country.UK));
        System.out.println(taxCalculator.calculateTax(100.0, Country.USA));
        System.out.println(taxCalculator.calculateTax(100.0, Country.EGY));//00
        System.out.println("____________________");
        System.out.println(taxCalculator.calculateTaxUsingFactory(100.0, Country.UK));
        System.out.println(taxCalculator.calculateTaxUsingFactory(100.0, Country.USA));
        System.out.println(taxCalculator.calculateTaxUsingFactory(100.0, Country.EGY));

        System.out.println("____________________");
        taxCalculator.setMyTaxCalculator(new UKTax());
        System.out.println(taxCalculator.calculateTaxUsingComposition(100.0));
        taxCalculator.setMyTaxCalculator(new USATax());
        System.out.println(taxCalculator.calculateTaxUsingComposition(100.0));
        taxCalculator.setMyTaxCalculator(new EGYTax());
        System.out.println(taxCalculator.calculateTaxUsingComposition(100.0));

        System.out.println("____________________");

        System.out.println(taxCalculator.calculateTax(100.0, new UKTax()));
        System.out.println(taxCalculator.calculateTax(100.0, new USATax()));
        System.out.println(taxCalculator.calculateTax(100.0, new EGYTax()));

    }
}
