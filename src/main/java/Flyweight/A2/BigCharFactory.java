package Flyweight.A2;

import java.util.HashMap;

/**
 * @author vert on 2021/4/30
 */
public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static BigCharFactory singleton = new BigCharFactory();
    private BigCharFactory(){
    }
    public static BigCharFactory getInstance(){
        return singleton;
    }
    public synchronized BigChar getBigChar(char charname){
        BigChar bc = (BigChar)pool.get("" + charname);
        if (bc == null){
            bc = new BigChar(charname);
            pool.put("" + charname,bc);
        }
        return bc;
    }
}
