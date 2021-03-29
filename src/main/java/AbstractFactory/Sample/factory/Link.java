package AbstractFactory.Sample.factory;

/**
 * @author vert on 2021/3/29
 */
public abstract class Link extends Item{
    protected String url;
    public Link (String caption,String url){
        super(caption);
        this.url = url;
    }
}
