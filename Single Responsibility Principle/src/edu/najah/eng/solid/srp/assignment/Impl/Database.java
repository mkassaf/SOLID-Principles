package edu.najah.eng.solid.srp.assignment.Impl;
import edu.najah.eng.solid.srp.assignment.*;
import edu.najah.eng.solid.srp.assignment.Invoice;
import edu.najah.eng.solid.srp.assignment.Intrf.*;

public class Database implements IDatabase{
    public Database(){
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
