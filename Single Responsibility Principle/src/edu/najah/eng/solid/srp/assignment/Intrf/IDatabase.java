package edu.najah.eng.solid.srp.assignment.Intrf;
import edu.najah.eng.solid.srp.assignment.Invoice;

public interface IDatabase {
    IMailSender mailSender = null;
    void Insert(Invoice invoice);
    void Delete(Invoice invoice);
}
