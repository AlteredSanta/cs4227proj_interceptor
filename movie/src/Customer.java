package src;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String result = "The rental records for " + getName() + " are:" + "\n";
        for (Rental rental : rentals)
        result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        result += "A total amount that is owed: " + String.valueOf(getTotalCharge()) + "\n";
        result += getName() + "earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<h1>The rental records for <b>" + getName() + " are:" + "</b></h1>\n";
        for (Rental rental : rentals)
        result += "<p>" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "</p>\n";
        result += "<p>A total amount that is owed: <b>" + String.valueOf(getTotalCharge()) + "</b></p>\n";
        result +=  getName() + "<p>earned <b>" + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points</b></p>";


        return result;
    }

    private double getTotalCharge() {
        double total = 0;
        for (Rental rental : rentals)
            total += rental.getCharge();
        return total;
    }

    private int getTotalFrequentRenterPoints() {
        int total = 0;
        for (Rental rental : rentals)
            total += rental.getFrequentRenterPoints();
        return total;
    }

}
