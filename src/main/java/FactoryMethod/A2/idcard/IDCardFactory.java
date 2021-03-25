package FactoryMethod.A2.idcard;

import FactoryMethod.A2.framework.Factory;
import FactoryMethod.A2.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author vert on 2021/3/25
 */
public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 100;
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner,serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(card.getSerial(),card.getOwner());
    }

    public HashMap getDatabase(){
        return database;
    }
}
