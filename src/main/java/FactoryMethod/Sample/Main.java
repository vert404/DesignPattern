package FactoryMethod.Sample;

import FactoryMethod.Sample.framework.Factory;
import FactoryMethod.Sample.framework.Product;
import FactoryMethod.Sample.idcard.IDCardFactory;

/**
 * @author vert on 2021/3/25
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();
    }
}
