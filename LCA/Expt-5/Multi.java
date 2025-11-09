class Book {
    public String author, title, publisher;
    
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
}

class BookSales extends BookInfo {
    public int noofcopiessold;
    
    public BookSales(String a, String t, String p, double pr, int stock, int copies) {
        super(a, t, p, pr, stock);
        noofcopiessold = copies;
    }
    
    public double RevenueGenerated() {
        return price * noofcopiessold;
    }
    
    public void AllShow() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("Copies Sold: " + noofcopiessold);
        System.out.println("Revenue Generated: " + RevenueGenerated());
        System.out.println();
    }
}

public class Multi {
    public static void main(String[] args) {
        BookSales book1 = new BookSales("Author1", "Book1", "Publisher1", 100.0, 50, 25);
        BookSales book2 = new BookSales("Author2", "Book2", "Publisher2", 150.0, 30, 15);
        BookSales book3 = new BookSales("Author3", "Book3", "Publisher3", 200.0, 40, 20);
        
        book1.AllShow();
        book2.AllShow();
        book3.AllShow();
    }
}
