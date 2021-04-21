package Visitor.Sample;

/**
 * @author vert on 2021/4/21
 */
public interface Element {
    public abstract void accept(Visitor v);
}
