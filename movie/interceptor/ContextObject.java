package interceptor;

import src.Customer;
import src.Rental;

public class ContextObject {
    private Rental rental;
    private Customer newcustomer;

    public ContextObject(Customer customer, Rental rental) {
        this.newcustomer = customer;
        this.rental = rental;
    }

    public double getCharge() {
        return rental.getCharge();
    }

        public int getDaysRent() {
        return rental.getDaysRented();
    }

    public String getMovieTitle() {
        return rental.getMovie().getTitle();
    }

    public double Points() {
        return rental.getFrequentRenterPoints();
    }

    public String getName() {
        return newcustomer.getName();
    }
}