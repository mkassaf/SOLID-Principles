package edu.najah.eng.solid.srp.exercise.impl;

import edu.najah.eng.solid.srp.exercise.Customer;
import edu.najah.eng.solid.srp.exercise.ReportGenerator;

import java.util.List;

public class CSVReport implements ReportGenerator {
    public String generate(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();
        sb.append("Id,");
        sb.append("Name,");
        sb.append("Address");
        sb.append("\n");
        for (Customer item : customers){
            sb.append(item.getId());
            sb.append(",");
            sb.append(item.getName());
            sb.append(",");
            sb.append(item.getAddress());
            sb.append("\n");
        }
        return sb.toString();
    }
}
