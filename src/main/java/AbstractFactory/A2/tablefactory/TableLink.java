package AbstractFactory.A2.tablefactory;

import AbstractFactory.A2.factory.Link;

/**
 * @author vert on 2021/3/30
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}