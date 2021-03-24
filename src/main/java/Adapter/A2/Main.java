package Adapter.A2;

import java.io.IOException;

/**
 * @author vert on 2021/3/24
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src\\main\\java\\Adapter\\A2\\file.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","21");
            f.writeToFile("src\\main\\java\\Adapter\\A2\\newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
