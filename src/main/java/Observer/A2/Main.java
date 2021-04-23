package Observer.A2;

/**
 * @author vert on 2021/4/23
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new FrameObserver();
        generator.add(observer1);
        generator.add(observer2);
        generator.add(observer3);
        generator.execute();
    }
}
