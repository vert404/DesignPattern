package AbstractFactory.Sample.tablefactory;

import AbstractFactory.Sample.factory.Link;

/**
 * @author vert on 2021/3/29
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
