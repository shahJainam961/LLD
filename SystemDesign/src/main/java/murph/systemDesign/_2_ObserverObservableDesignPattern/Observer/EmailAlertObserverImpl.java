package murph.systemDesign._2_ObserverObservableDesignPattern.Observer;

import murph.systemDesign._2_ObserverObservableDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock hurry up!!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Email sent to : "+emailId+" with msg : "+msg);
    }
}
