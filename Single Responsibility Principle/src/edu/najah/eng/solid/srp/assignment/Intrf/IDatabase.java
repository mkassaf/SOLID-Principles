package edu.najah.eng.solid.srp.assignment.Inrtf;

public interface IDatabase {
    IMailSender mailSender;
    void Insert(Invoice invoice);
    void Delete(Invoice invoice);
}
