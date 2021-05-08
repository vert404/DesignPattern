package Flyweight.A2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author vert on 2021/4/30
 */
public class BigChar {
    private char charname;
    private String fontdata;
    public BigChar(char charname){
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(System.getProperty("user.dir") + "\\src\\main\\java\\Flyweight\\A2\\" + "big" + charname + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print(){
        System.out.println(fontdata);
    }
}