package Observer.Sample;

/**
 * @author vert on 2021/4/23
 */
public class DigitObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
        }
    }
    
}
