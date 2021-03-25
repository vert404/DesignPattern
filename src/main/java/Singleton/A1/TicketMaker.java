package Singleton.A1;

/**
 * @author vert on 2021/3/25
 */
public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();
    public TicketMaker(){
    }

    public static TicketMaker getInstance() {
        return singleton;
    }
    public int getNextTicketNumber() {
        return ticket++;
    }

}
