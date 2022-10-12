package edu.najah.eng.solid.srp.assignment;

import java.util.Date;

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

    public void add()  {
        // connect to database
        // execute insert command to add new record in database
        //close the database connection
        // Once Invoice has been added , send mail
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        this.sendEmail(mailMessage);
    }
    public void delete()  {
        // connect to database
        // execute delete command to delete the invoice from the database
        //close the database connection
    }
    public void sendEmail(MailMessage mailMessage)  {
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } else {
            //show error message for the user
        }

    }
}
