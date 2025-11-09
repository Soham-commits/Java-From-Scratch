public class Cube {
    private double length;
    private double breadth;
    private double height;

    // Default constructor
    public Cube() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    // Parameterized constructor
    public Cube(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Cube cube1 = new Cube();
        Cube cube2 = new Cube(3, 4, 5);
        Cube cube3 = new Cube(2, 6, 8);

        System.out.println("Volume of cube1: " + cube1.calculateVolume());
        System.out.println("Volume of cube2: " + cube2.calculateVolume());
        System.out.println("Volume of cube3: " + cube3.calculateVolume());
    }
}
