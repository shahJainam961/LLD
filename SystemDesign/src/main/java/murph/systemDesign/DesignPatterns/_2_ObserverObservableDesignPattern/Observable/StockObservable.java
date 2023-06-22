package murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observable;

import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newStockCount);
    int getStockCount();
}
