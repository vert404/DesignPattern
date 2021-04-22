package ChainOfResponsibility.A4;

/**
 * @author vert on 2021/4/22
 */
public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name,int limit){
        super(name);
        this.limit = limit;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit){
            return true;
        }else{
            return false;
        }
    }
}
