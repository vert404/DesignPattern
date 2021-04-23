package Memento.A4;

import Memento.A4.game.Gamer;
import Memento.A4.game.Memento;

import java.io.*;

/**
 * @author vert on 2021/4/23
 */
public class Main {
    public static final String SAVEFILENAME = "game.dat";
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null){
            System.out.println("读取上次保存存档开始游戏。");
            gamer.restoreMemento(memento);
        }else{
            System.out.println("新游戏。");
            memento = gamer.createMemento();
        }
        int startMoney = memento.getMoney();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态:" + gamer);

            gamer.bet();

            System.out.println("所持金钱为" + gamer.getMoney() + "元。");

            if (gamer.getMoney() > memento.getMoney()){
                System.out.println("    （所持金钱增加了许多，因此保存游戏当前的状态）");
                memento = gamer.createMemento();
            }else if (gamer.getMoney() < memento.getMoney() / 2){
                System.out.println("    （所持金钱减少了许多，因此将游戏恢复至以前的状态）");
                gamer.restoreMemento(memento);
            }

            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("");

            if (gamer.getMoney() - startMoney >= 300){
                saveMemento(memento);
                System.out.println("保存游戏数据");
                break;
            }
        }
    }
    public static void saveMemento(Memento memento){
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Memento\\A4\\" + SAVEFILENAME));
            out.writeObject(memento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Memento loadMemento(){
        Memento memento = null;
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Memento\\A4\\" + SAVEFILENAME));
            memento = (Memento) in.readObject();
            in.close();
        } catch (FileNotFoundException e){
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
