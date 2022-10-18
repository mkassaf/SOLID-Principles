package edu.najah.eng.solid.lsp.assignment;

public class App {
    public static void main(String[] args) {

        Customer customer = new Customer();
        //Customer customer = new LimitedCustomer();//What will happen if we replace this line with previous one ??

        for (int i = 0; i < 20; i++) {
            customer.addOffers(new Offer());
        }

        System.out.println(customer.getOffers().size());

    }
}
