package edu.najah.eng.solid.srp.assignment;

import java.util.Date;

import edu.najah.eng.solid.srp.assignment.Inrtf.IDatabase;

/**
 * What are the responsibilities for this class?
 * Do the required change to make this class single responsibility
 */
public class Invoice {

    private long amount;
    private Date invoiceDate;
    
    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }
    public long getAmount(){
        return amount;
    }
    public Date getDate(){
        return invoiceDate;
    }
}



///// this class is supposed to be only for creating Invoice ticket.


///// we should have class for DB, for making connection, add and delete records. -- this one should be Interface to allow us to
//connect to any DB.


///// we should have a class for sending emails.
