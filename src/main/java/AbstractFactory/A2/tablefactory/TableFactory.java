package AbstractFactory.A2.tablefactory;

import AbstractFactory.A2.factory.Factory;
import AbstractFactory.A2.factory.Link;
import AbstractFactory.A2.factory.Page;
import AbstractFactory.A2.factory.Tray;

/**
 * @author vert on 2021/3/30
 */
public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
