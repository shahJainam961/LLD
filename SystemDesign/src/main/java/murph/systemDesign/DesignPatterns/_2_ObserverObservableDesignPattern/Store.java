package murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern;

import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observable.IphoneStockObservable;
import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observable.StockObservable;
import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observer.EmailAlertObserverImpl;
import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observer.NotificationAlertObserver;
import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observer.MobileAlertObserverImpl;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1 =
                new EmailAlertObserverImpl("shahjainam@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 =
                new EmailAlertObserverImpl("shahjainam1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 =
                new MobileAlertObserverImpl("9426629486", iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(4);
//
        iphoneStockObservable.remove(observer2);

        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(9);

        /*
        * Other examples
        * Cricket Scoreboard Observable --- Cricbuzz, FanSite, Google, etc. Observers
        * YouTube Channel Observable --- Subscribers Observers
        * In Twitter/Facebook Individual Observable --- Individual's followers Observers
        * Notify me Button ( Implemented in these example)
        * Weather Station Observable --- Mobile Screen, Weather App, etc. Observers
        */
    }

}
