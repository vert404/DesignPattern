package Strategy.A4;

/**
 * @author vert on 2021/4/6
 */
public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data,Sorter sorter){
        this.data = data;
        this.sorter = sorter;
    }
    public void execute(){
        print();
        sorter.sort(data);
        print();
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
}
