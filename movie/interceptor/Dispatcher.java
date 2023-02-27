package interceptor;

import java.util.ArrayList;

public class Dispatcher {

    ArrayList<ConcreteInterceptor> interceptor;

    public Dispatcher() {
        interceptor = new ArrayList<ConcreteInterceptor>();
    }

    public void attach(ConcreteInterceptor intercepotr) {
        interceptor.add(intercepotr);
    }

    public void detach(ConcreteInterceptor intercepotr) {
        interceptor.remove(intercepotr);
    }

    public void dispatchRent(ContextObject contextObj) {
        for (ConcreteInterceptor i : interceptor) {
            i.RentIntercept(contextObj);
            ;
        }
    }

    public void dispatchPoints(ContextObject CO) {
        for (ConcreteInterceptor i : interceptor) {
            i.PointIntercept(CO);
            ;
        }
    }
}
