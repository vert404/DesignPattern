package Facade.A2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author vert on 2021/4/22
 */
public class PageMaker {
    private PageMaker(){}
    public static void makeWelcomePage(String mailaddr,String filename){
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(
                    new FileWriter(System.getProperty("user.dir") + "\\src\\main\\java\\Facade\\A2\\" + filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename){
        try {
            HtmlWriter writer = new HtmlWriter(
                    new FileWriter(System.getProperty("user.dir") + "\\src\\main\\java\\Facade\\A2\\" + filename));
            writer.title("Link Page");
            Properties mailprop = Database.getProperties("maildata");
            Enumeration en = mailprop.propertyNames();
            while(en.hasMoreElements()){
                String mailaddr = (String) en.nextElement();
                String username = mailprop.getProperty(mailaddr,"(unknown)");
                writer.mailto(mailaddr, username);
            }
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
