package Flyweight.A1;

/**
 * @author vert on 2021/4/30
 */
public class BigString {
    private BigChar[] bigChars;
    public BigString (String string){
        initShared(string);
    }
    public BigString (String string,boolean shared){
        if (shared){
            initShared(string);
        }else{
            initUnShared(string);
        }
    }
    private void initShared(String string){
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    private void initUnShared(String string){
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = new BigChar(string.charAt(i));
        }
    }
    public void print(){
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
