package Bridge.A2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author vert on 2021/4/1
 */
public class FileDisplayImpl extends DisplayImpl{
    private String filename;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT = 4096;  // 循环显示的极限（缓存大小限制）
    public FileDisplayImpl(String filename){
        this.filename = filename;
    }
    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\Bridge\\A2\\"+filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-= " + filename + " =-=-=-=-=-=");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while((line = reader.readLine()) != null){
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println();
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
