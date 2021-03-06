package Flyweight.A2;

/**
 * @author vert on 2021/4/30
 */
public class Main {
    private static BigString[] bigStrings = new BigString[1000];
    public static void main(String[] args) {
        System.out.println("共享时:");
        testAllocation(true);
        System.out.println("非共享时:");
        testAllocation(false);
    }
    public static void testAllocation(boolean shared){
        for (int i = 0; i < bigStrings.length; i++) {
            bigStrings[i] = new BigString("1212123",shared);
        }
        showMemory();
    }
    public static void showMemory(){
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用内存 = " + used);
    }
}
