package Strategy.A4;

/**
 * @author vert on 2021/4/6
 */
public class Main {
    public static void main(String[] args) {
        String[] data = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new QuickSorter());
        sap.execute();
    }
}
