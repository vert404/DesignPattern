package Visitor.A2;

import java.util.Iterator;

/**
 * @author vert on 2021/4/21
 */
public class SizeVisitor extends Visitor{
    private int size;
    public int getSize(){
        return size;
    }
    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
