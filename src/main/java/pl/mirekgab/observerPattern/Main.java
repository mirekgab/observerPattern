package pl.mirekgab.observerPattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello mirek");
        
        ObserverClass1 class1Object1 = new ObserverClass1("class1Object1");
        ObserverClass1 class1Object2 = new ObserverClass1("class1Object2");
        
        ObserverClass2 class2Object1 = new ObserverClass2("class2Object1");
        ObserverClass2 class2Object2 = new ObserverClass2("class2Object2");
        
        ObservableObject observableObject = new ObservableObject();

        observableObject.addObserver(class1Object1);
        observableObject.addObserver(class2Object1);
        observableObject.addObserver(class1Object2);
        observableObject.addObserver(class2Object2);
        
        observableObject.sendMessageToAll("test message from observable object");
    }
}
