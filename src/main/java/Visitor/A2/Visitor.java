package Visitor.A2;

/**
 * @author vert on 2021/4/21
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);

}
