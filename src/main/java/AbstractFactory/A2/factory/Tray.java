package AbstractFactory.A2.factory;

import java.util.ArrayList;

/**
 * @author vert on 2021/3/30
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
