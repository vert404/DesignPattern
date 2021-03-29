package AbstractFactory.Sample.factory;

/**
 * @author vert on 2021/3/29
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }

    public abstract String makeHTML();
}
