package AbstractFactory.Sample.listfactory;

import AbstractFactory.Sample.factory.Link;

/**
 * @author vert on 2021/3/29
 */
public class ListLink extends Link {
    public ListLink(String caption,String url){
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
