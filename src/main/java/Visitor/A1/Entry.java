package Visitor.A1;

import java.util.Iterator;

/**
 * @author vert on 2021/4/21
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
