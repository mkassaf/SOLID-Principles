package edu.najah.eng.solid.srp.assignment.Impl;

import edu.najah.eng.solid.srp.assignment.IDatabase;
import edu.najah.eng.solid.srp.assignment.Invoice;
import edu.najah.eng.solid.srp.assignment.MailSender;

public class Database implements IDatabase{
    Database(){
        //Make Connection
    }
    
    @Override
    public void Insert(Invoice invoice) {
        //insert the invoice to the database
        //then send the email
        IMailSender mailSender = new MailSender();
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        mailSender.sendEmail(mailMessage);      
    }
    @Override
    public void Delete(Invoice invoice){
        //Delete the invoice
    }
}
