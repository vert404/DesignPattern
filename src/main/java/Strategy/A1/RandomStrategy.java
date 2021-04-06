package Strategy.A1;

import java.util.Random;

/**
 * @author vert on 2021/4/6
 */
public class RandomStrategy implements Strategy{
    private Random random;
    public RandomStrategy(int seed){
        random = new Random(seed);
    }
    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
