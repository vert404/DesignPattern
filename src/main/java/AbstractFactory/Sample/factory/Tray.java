package AbstractFactory.Sample.factory;

import java.util.ArrayList;

/**
 * @author vert on 2021/3/29
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption){
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }

}
