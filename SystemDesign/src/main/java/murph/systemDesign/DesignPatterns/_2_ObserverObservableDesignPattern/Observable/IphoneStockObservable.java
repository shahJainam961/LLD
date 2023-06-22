package murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observable;

import murph.systemDesign.DesignPatterns._2_ObserverObservableDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount==0){
            stockCount = newStockCount;
            notifySubscribers();
        }
        else stockCount = newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
