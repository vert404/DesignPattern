package TemplateMethod.Sample;

/**
 * @author vert on 2021/3/24
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;
    public CharDisplay(char ch){
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
