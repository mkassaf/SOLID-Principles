package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public class Customer {
    protected ArrayList<Offer> offers = null;

    public Customer(){
        offers = new ArrayList<>();
    }

 public List<Offer> getOffers() {
    return new ArrayList<>(offers); // Return a copy of the list to prevent direct modification
}


    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }
}
