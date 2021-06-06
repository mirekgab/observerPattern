package pl.mirekgab.observerPattern;

/**
 *
 * @author mirek
 */
public class ObserverClass1 implements ObserverInterface{
    private String name;

    ObserverClass1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.getClass().getName()+" "+this.getName()+" receive message: "+message);
    }
    
}
