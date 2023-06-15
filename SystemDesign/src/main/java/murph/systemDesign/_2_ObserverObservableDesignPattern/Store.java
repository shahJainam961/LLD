package murph.systemDesign._2_ObserverObservableDesignPattern;

import murph.systemDesign._2_ObserverObservableDesignPattern.Observable.IphoneStockObservable;
import murph.systemDesign._2_ObserverObservableDesignPattern.Observable.StockObservable;
import murph.systemDesign._2_ObserverObservableDesignPattern.Observer.EmailAlertObserverImpl;
import murph.systemDesign._2_ObserverObservableDesignPattern.Observer.MobileAlertObserverImpl;
import murph.systemDesign._2_ObserverObservableDesignPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1 =
                new EmailAlertObserverImpl("shahjainam@gmail.com", new IphoneStockObservable());
        NotificationAlertObserver observer2 =
                new EmailAlertObserverImpl("shahjainam1@gmail.com", new IphoneStockObservable());
        NotificationAlertObserver observer3 =
                new MobileAlertObserverImpl("9426629486", new IphoneStockObservable());


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(4);

        iphoneStockObservable.remove(observer2);

        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(4);
    }

}
