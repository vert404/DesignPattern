package Iterator.Sample;

/**
 * @author vert on 2021/3/22
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBooks(new Book("Around the World in 80 Days"));
        bookShelf.appendBooks(new Book("Bible"));
        bookShelf.appendBooks(new Book("Cinderella"));
        bookShelf.appendBooks(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
