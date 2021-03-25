package Singleton.A3_1;

/**
 * @author vert on 2021/3/25
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("生成了一个实例");
        slowdown();
    }
    //不进行同步多线程下可能会生成多个实例
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
