package edu.najah.eng.solid.lsp.assignment;


// The Liskov Substitution Principle (LSP) is one of the SOLID principles, and it states that
//     objects of a derived class should be able to replace objects of the base class without affecting the correctness of the program. 
//     In your code, you have a base class Customer and a derived class LimitedCustomer. To make sure that you adhere to the Liskov Substitution Principle,
//     you need to ensure that the derived class LimitedCustomer is a true subtype of the base class Customer.
    
public class LimitedCustomer extends Customer{

    private static final int MAX_ALLOWED_OFFER = 3;

    public void addOffers(Offer offer) {
        if (isReachedMaxAllowedOffers()){
            System.err.println("Limited customer can not add more that " + MAX_ALLOWED_OFFER + " offers" );
            return;
        }
        super.addOffers(offer);
    }

    private boolean isReachedMaxAllowedOffers() {
        return this.offers.size() >= MAX_ALLOWED_OFFER;
    }

}
