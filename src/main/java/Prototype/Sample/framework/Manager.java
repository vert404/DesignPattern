package Prototype.Sample.framework;

import java.util.HashMap;

/**
 * @author vert on 2021/3/25
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name,Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
