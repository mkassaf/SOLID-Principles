package edu.najah.eng.solid.srp.exercise;

import edu.najah.eng.solid.srp.exercise.impl.CSVReport;
import edu.najah.eng.solid.srp.exercise.impl.PDFReport;

import java.util.ArrayList;
import java.util.List;

public class CustomerHelper {

    List<Customer> customers =  new ArrayList<Customer>();

    /**
     * Get All customers info
     * @return
     */
    public List<Customer> getAllCustomers() {

        return customers;
    }

    /**
     * Search for a customer for give id
     * @param customerid
     * @return
     */
    public Customer getCustomerById(int customerid) {
        for (Customer customer : customers){
            if (customer.getId() == customerid){
                return customer;
            }
        }
        return null;
    }

    /**
     * Export -> report -> PDF, String, JSON, CSV .. format
     * @return
     */
    public String exportCustomerData(String type) {
        ReportGenerator generateReport = ReportGeneratorFactory.getInstance(type);

        if (generateReport != null){
            return generateReport.generate(this.customers);
        }
        return "INVALID_TYPE";//throw exception

    }
}
