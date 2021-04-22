package Facade.Sample;

import Facade.Sample.pagemaker.PageMaker;

/**
 * @author vert on 2021/4/22
 */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
