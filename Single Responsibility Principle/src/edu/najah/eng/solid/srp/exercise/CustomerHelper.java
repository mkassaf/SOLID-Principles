package edu.najah.eng.solid.srp.exercise;

import java.util.ArrayList;
import java.util.List;

public class CustomerHelper {

    List<Customer> customers =  new ArrayList<Customer>();

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerByID(int customerid) {
        for (Customer customer : customers){
            if (customer.getId() == customerid){
                return customer;
            }
        }
        return null;
    }

    public String ExportCustomerData() {
        StringBuilder sb = new StringBuilder();
        for (Customer item : customers){
            sb.append(item.getId());
            sb.append(",");
            sb.append(item.getName());
            sb.append(",");
            sb.append(item.getAddress());
        }
        return sb.toString();
    }
}
