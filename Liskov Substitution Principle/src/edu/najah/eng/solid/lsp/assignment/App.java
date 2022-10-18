package edu.najah.eng.solid.lsp.assignment;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //LimitedCustomer customer = new LimitedCustomer(); ???

        for (int i = 0; i < 20; i++) {
            customer.addOffers(new Offer());
        }

        System.out.println(customer.getOffers().size());

    }
}
