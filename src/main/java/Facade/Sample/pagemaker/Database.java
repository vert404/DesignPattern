package Facade.Sample.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author vert on 2021/4/22
 */
public class Database {
    private Database(){
    }

    public static Properties getProperties(String dbname){
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Facade\\Sample\\" + filename));
        } catch (IOException e) {
            System.out.println("Warning " + filename + " is not found.");
        }
        return prop;
    }
}
