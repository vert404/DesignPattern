package Bridge.A1;

/**
 * @author vert on 2021/3/31
 */
public class Main {
    public static void main(String[] args) {
        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, Universe."));
        d.randomDisplay(5);
    }
}
