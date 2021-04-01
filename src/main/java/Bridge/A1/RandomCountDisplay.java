package Bridge.A1;

import java.util.Random;

/**
 * @author vert on 2021/4/1
 */
public class RandomCountDisplay extends CountDisplay{
    Random random = new Random();
    public RandomCountDisplay(DisplayImpl impl){
        super(impl);
    }
    public void randomDisplay(int times){
        multiDisplay(random.nextInt(times));
    }
}
