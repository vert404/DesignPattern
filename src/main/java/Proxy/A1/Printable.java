package Proxy.A1;

/**
 * @author vert on 2021/5/13
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
