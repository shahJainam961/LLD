package murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observer;

import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String contact;
    StockObservable observable;

    public MobileAlertObserverImpl(String contact, StockObservable observable){
        this.contact = contact;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(contact, "Product is in stock hurry up!!" + observable.getStockCount());
    }

    private void sendMail(String contact, String msg){
        System.out.println("Sms sent to : "+contact+" with msg : "+msg);
    }
}
