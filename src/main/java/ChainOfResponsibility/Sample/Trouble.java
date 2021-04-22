package ChainOfResponsibility.Sample;

/**
 * @author vert on 2021/4/22
 */
public class Trouble {
    private int number;
    public Trouble(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public String toString(){
        return "[Trouble " + number + "]";
    }
}
