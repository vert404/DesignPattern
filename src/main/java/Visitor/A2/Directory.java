package Visitor.A2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author vert on 2021/4/21
 */
public class Directory extends Entry{
    private String name;
    private ArrayList dir = new ArrayList();
    public Directory (String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        SizeVisitor v = new SizeVisitor();
        accept(v);
        return v.getSize();
    }

    public Entry add(Entry entry){
        dir.add(entry);
        return this;
    }

    public Iterator iterator(){
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
