package AbstractFactory.A2;

import AbstractFactory.A2.factory.Factory;
import AbstractFactory.A2.factory.Page;

/**
 * @author vert on 2021/3/30
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: AbstractFactory.A2.listfactory.ListFactory");
            System.out.println("Example 2: AbstractFactory.A2.tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Page page = factory.createYahooPage();
        page.output();
    }
}
