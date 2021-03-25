package FactoryMethod.A2.framework;

import java.util.HashMap;

/**
 * @author vert on 2021/3/25
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct (Product product);
}
