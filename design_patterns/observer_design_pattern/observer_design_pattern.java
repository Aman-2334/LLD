package design_patterns.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

interface observable{
    void add(observer subscriber);
    void remove(observer subscriber);
    void notifySubscriber();
    void setData(int stock);
}

interface observer{
    void update();
}

class SomeProductObservableImpl implements observable{
    List<observer> subscriberList = new ArrayList<>();
    int stock = 0;
    
    @Override
    public void add(observer subscriber) { subscriberList.add(subscriber); }
    @Override
    public void remove(observer subscriber) { subscriberList.remove(subscriber); }
    @Override
    public void notifySubscriber() {
        for (observer subscriber : subscriberList) { subscriber.update(); }
    }
    @Override
    public void setData(int stock) { this.stock += stock; notifySubscriber();}
}

class EmailUpdateObserverImpl implements observer{
    String email;
    observable observable;

    EmailUpdateObserverImpl(String email, observable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        // send email updates
    }
}

public class observer_design_pattern {
    public static void main(String[] args) {
        observable productObservable = new SomeProductObservableImpl();
        EmailUpdateObserverImpl observer1 = new EmailUpdateObserverImpl("", productObservable);
        productObservable.add(observer1);
    }
}
