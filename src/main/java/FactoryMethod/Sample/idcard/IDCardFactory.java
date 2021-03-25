package FactoryMethod.Sample.idcard;

import FactoryMethod.Sample.framework.Factory;
import FactoryMethod.Sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vert on 2021/3/25
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
