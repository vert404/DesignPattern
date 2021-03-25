package Singleton.Sample;

/**
 * @author vert on 2021/3/25
 */
public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2){
            System.out.println("obj1 与 obj2 是相同的实例");
        }else{
            System.out.println("obj1 与 obj2 是不同的实例");
        }
    }
}
