package edu.najah.eng.solid.ocp.exercise;

public class Main {

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculateTax(100.0, Country.UK));
        System.out.println(taxCalculator.calculateTax(100.0, Country.USA));
        System.out.println(taxCalculator.calculateTax(100.0, Country.IN));

    }
}
