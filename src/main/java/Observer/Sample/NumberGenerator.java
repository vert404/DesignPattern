package Observer.Sample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author vert on 2021/4/23
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    public void add(Observer observer){
        observers.add(observer);
    }
    public void delete(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        Iterator it = observers.iterator();
        while (it.hasNext()){
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
