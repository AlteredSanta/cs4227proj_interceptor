package test;

import src.Movie;
import src.Customer;
import src.Rental;
import interceptor.Dispatcher;
import interceptor.ConcreteInterceptor;
import interceptor.ContextObject;

import org.junit.Test;

public class testCase1 {

    @Test
    public void test() {
        Dispatcher dispatcher = new Dispatcher();
        ConcreteInterceptor coninter = new ConcreteInterceptor();
        dispatcher.attach(coninter);
        Customer newCustomer = new Customer("Andy Whelan");

        Rental film1 = new Rental ( new Movie("Deadpool 2 (2018)", Movie.NEW_RELEASE), 2);
        Rental film2 = new Rental ( new Movie("Fast & Furious 7 (2015)", Movie.NEW_RELEASE), 5);
        Rental film3 = new Rental ( new Movie("The Gentlemen (2019)", Movie.NEW_RELEASE), 5);
        Rental film4 = new Rental ( new Movie("The Irish Man (2019)", Movie.NEW_RELEASE), 2);
        Rental film5 = new Rental ( new Movie("Once Upon a Time... in Hollywood (2019)", Movie.NEW_RELEASE), 4);

        newCustomer.addRental(film1);
        ContextObject CObj = new ContextObject(newCustomer, film5);

        newCustomer.addRental(film2);
        newCustomer.addRental(film3);
        newCustomer.addRental(film4);
        newCustomer.addRental(film5);

        dispatcher.dispatchRent(CObj);
        String expected = "This person: Andy Whelan rented this movie: Once Upon a Time... in Hollywood (2019) for 4 days and it costed him: €12.0";

        System.out.println("And we expected: ");
        System.out.println(expected);
        System.out.println(newCustomer.statement());
        System.out.println(dispatcher.equals(newCustomer.statement()));
    }

}
