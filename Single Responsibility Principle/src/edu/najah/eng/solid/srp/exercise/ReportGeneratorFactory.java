package edu.najah.eng.solid.srp.exercise;

import edu.najah.eng.solid.srp.exercise.impl.CSVReport;
import edu.najah.eng.solid.srp.exercise.impl.PDFReport;

public class ReportGeneratorFactory {
    public static ReportGenerator getInstance(String type) {
        ReportGenerator generateReport = null;
        if (type.equals("CSV")){
            generateReport = new CSVReport();
        } else if(type.equals("PDF")){
            generateReport = new PDFReport();
        }
        return generateReport;
    }
}
