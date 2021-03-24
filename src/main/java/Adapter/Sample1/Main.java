package Adapter.Sample1;

/**
 * @author vert on 2021/3/24
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
