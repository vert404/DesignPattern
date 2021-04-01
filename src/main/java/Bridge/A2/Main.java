package Bridge.A2;

/**
 * @author vert on 2021/3/31
 */
public class Main {
    public static void main(String[] args) {
        Display d = new Display(new FileDisplayImpl("star.txt"));
        d.display();
    }
}
