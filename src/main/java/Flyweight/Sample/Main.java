package Flyweight.Sample;

/**
 * @author vert on 2021/4/30
 */
public class Main {
    public static void main(String[] args) {
        String string = "1212123";

        BigString bs = new BigString(string);
        bs.print();
    }
}
