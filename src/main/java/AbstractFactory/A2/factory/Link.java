package AbstractFactory.A2.factory;

/**
 * @author vert on 2021/3/30
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
