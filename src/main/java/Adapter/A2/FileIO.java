package Adapter.A2;

import java.io.IOException;

/**
 * @author vert on 2021/3/24
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
