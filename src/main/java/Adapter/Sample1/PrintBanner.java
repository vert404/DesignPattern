package Adapter.Sample1;

/**
 * @author vert on 2021/3/24
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner (String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
