package pl.mirekgab.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mirek
 */
public class ObservableObject {
    private List<ObserverInterface> observers = new ArrayList<>();
    
    public void addObserver(ObserverInterface observerObject) {
        observers.add(observerObject);
    }
    
    public void deleteObserverObject(ObserverInterface observer) {
        observers.remove(observer);
    }
    
    public void sendMessageToAll(String message) throws InterruptedException {
        System.out.println("send message to all observers");
        for (ObserverInterface o : observers) {
            Thread.sleep(2000);
            o.update(message);
        }
        System.out.println("message sent to all observers");
    }
}
