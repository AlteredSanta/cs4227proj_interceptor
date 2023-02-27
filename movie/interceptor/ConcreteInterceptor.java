package interceptor;

public class ConcreteInterceptor implements Interceptor {

    public void RentIntercept(ContextObject ConObj) {
        String string = "This person: " + ConObj.getName() + " rented this movie: " + ConObj.getMovieTitle() + " for " + ConObj.getDaysRent() + " days and it costed him: €"
        + ConObj.getCharge();
        System.out.println(string);
    }

    public void PointIntercept(ContextObject ConObj) {
        String string = ConObj.getName() + " has a total of" + ConObj.Points() + " FRP (Frequent Renter Points)";
        System.out.println(string);
    }

}
