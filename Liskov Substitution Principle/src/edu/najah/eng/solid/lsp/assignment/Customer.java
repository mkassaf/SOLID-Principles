package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public class Customer {
    protected ArrayList<Offer> offers = null;

    public Customer(){
        offers = new ArrayList<>();
    }

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }
}
