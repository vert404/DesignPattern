package AbstractFactory.A2.factory;

/**
 * @author vert on 2021/3/30
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
