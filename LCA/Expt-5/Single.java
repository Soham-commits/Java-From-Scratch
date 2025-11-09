class Book {
    protected String author, title, publisher;
    
    public Book(String a, String t, String p) {
        author = a;
        title = t;
        publisher = p;
    }
}

class BookInfo extends Book {
    public double price;
    public int stockPosition;
    
    public BookInfo(String a, String t, String p, double pr, int stock) {
        super(a, t, p);
        price = pr;
        stockPosition = stock;
    }
    
    public void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stockPosition);
        System.out.println();
    }
}

public class Single {
    public static void main(String[] args) {
        BookInfo book1 = new BookInfo("Author1", "Book1", "Publisher1", 100.0, 10);
        BookInfo book2 = new BookInfo("Author2", "Book2", "Publisher2", 200.0, 20);
        BookInfo book3 = new BookInfo("Author3", "Book3", "Publisher3", 300.0, 30);
        
        book1.show();
        book2.show();
        book3.show();
    }
}