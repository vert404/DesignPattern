package Visitor.A3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author vert on 2021/4/21
 */
public class ElementArrayList extends ArrayList implements Element {
    @Override
    public void accept(Visitor v) {
        Iterator it = iterator();
        while(it.hasNext()){
            Element e = (Element) it.next();
            e.accept(v);
        }
    }
}
