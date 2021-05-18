package Interpreter.Sample;

/**
 * @author vert on 2021/5/18
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
