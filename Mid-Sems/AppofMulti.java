class Book{
    String title,publisher,author;
    Book(String tit, String pub, String auth)
    {
        title = tit;
        publisher = pub;
        author = auth;
    }
}

class Bookinfo extends Book{
    int price , stockPosition;
    Bookinfo(String tit, String pub, String auth, int pri, int sp)
    {
        super(tit,pub,auth);
        price = pri;
        stockPosition = sp;
    }
}

class Booksales extends Bookinfo{
    int noofcopiessold;
    Booksales(String tit, String pub, String auth, int pri, int sp, int copies)
    {
        super(tit,pub,auth,pri,sp);
        noofcopiessold = copies;
    }
    
    int revenue()
    {
        return noofcopiessold*price;
    }

    void show()
    {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("Number of Copies Sold: " + noofcopiessold);
        System.out.println("Revenue: " + revenue());
    }
}

public class AppofMulti{
    public static void main(String [] Args)
    {
        Booksales book = new Booksales("Java Programming", "XYZ Publishers", "John Doe", 500, 10, 5);
        book.show();
    }
}

