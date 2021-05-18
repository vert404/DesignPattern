package Interpreter.Sample;

import java.util.*;
import java.io.*;

/**
 * @author vert on 2021/5/18
 */
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\Interpreter\\Sample\\"+"program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
