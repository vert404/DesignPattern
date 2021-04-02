package Strategy.Sample;

/**
 * @author vert on 2021/4/2
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
