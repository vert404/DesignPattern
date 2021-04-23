package Observer.Sample;

/**
 * @author vert on 2021/4/23
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.add(observer1);
        generator.add(observer2);
        generator.execute();
    }
}
