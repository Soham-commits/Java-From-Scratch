public class Mobile {
    private String companyName;
    private double screenSize;

    // Constructor to initialize data members
    public Mobile(String company, double size) {
        companyName = company;
        screenSize = size;
    }

    // Method to display the details of the mobile
    public void display() {
        System.out.println("Company Name: " + companyName + ", Screen Size: " + screenSize + " inches");
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung", 6.5);
        Mobile mobile2 = new Mobile("Apple", 6.1);
        Mobile mobile3 = new Mobile("OnePlus", 6.4);
        Mobile mobile4 = new Mobile("Google", 6.3);
        Mobile mobile5 = new Mobile("Xiaomi", 6.7);

        mobile1.display();
        mobile2.display();
        mobile3.display();
        mobile4.display();
        mobile5.display();
    }
}
