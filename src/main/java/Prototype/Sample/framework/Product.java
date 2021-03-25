package Prototype.Sample.framework;

/**
 * @author vert on 2021/3/25
 */
public interface Product extends Cloneable{
    public abstract void use(String s);

    public abstract Product createClone();
}
