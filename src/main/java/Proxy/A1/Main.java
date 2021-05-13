package Proxy.A1;

/**
 * @author vert on 2021/5/13
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice","Proxy.A1.Printer");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}
