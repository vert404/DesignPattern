package Memento.Sample.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vert on 2021/4/23
 */
public class Memento {
    int money;
    ArrayList fruits;
    Memento (int money){
        this.money = money;
        this.fruits = new ArrayList();
    }
    public int getMoney(){
        return money;
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List getFruits(){
        return (List)fruits.clone();
    }
}
