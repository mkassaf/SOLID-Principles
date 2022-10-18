package edu.najah.eng.solid.srp.assignment;

import edu.najah.eng.solid.srp.assignment.Impl.Database;
import edu.najah.eng.solid.srp.assignment.Intrf.IDatabase;

public class InvoiceHelper {
    
    private static IDatabase DB = new Database();

    public void add(Invoice invoice)  {
        DB.Insert(invoice);
     }
    public void delete(Invoice invoice)  {
        DB.Delete(invoice);
     }
 
}
