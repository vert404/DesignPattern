package Observer.A1;

/**
 * @author vert on 2021/4/23
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.add(observer1);
        generator.add(observer2);
        generator.execute();
    }
}
