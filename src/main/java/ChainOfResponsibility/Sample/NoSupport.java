package ChainOfResponsibility.Sample;

/**
 * @author vert on 2021/4/22
 */
public class NoSupport extends Support {
    public NoSupport(String name){
        super(name);
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
