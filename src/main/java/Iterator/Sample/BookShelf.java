package Iterator.Sample;

/**
 * 具体的集合，创建具体的Iterator角色
 * @author vert on 2021/3/22
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBooks(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
