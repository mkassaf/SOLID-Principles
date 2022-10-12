package edu.najah.eng.solid.srp.assignment;

public class InvoiceHelper {
    
    private static IDatabase DB = new Database();

    public void add(Invoice invoice)  {
        DB.Insert(invoice);
     }
    public void delete(Invoice invoice)  {
        DB.Delete(invoice);
     }
 
}
