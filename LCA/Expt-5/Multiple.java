// Single interface for student data
interface StudentData {
    void setData(int roll, String name, String result);
    void display();
}

// First Year class
class FY implements StudentData {
    int roll;
    String name;
    String result;

    public void setData(int roll, String name, String result) {
        this.roll = roll;
        this.name = name;
        this.result = result;
    }

    public void display() {
        System.out.println("FY: " + roll + ", " + name + ", " + result);
    }
}

// Second Year class
class SY implements StudentData {
    int roll;
    String name;
    String result;

    public void setData(int roll, String name, String result) {
        this.roll = roll;
        this.name = name;
        this.result = result;
    }

    public void display() {
        System.out.println("SY: " + roll + ", " + name + ", " + result);
    }
}

public class Multiple {
    public static void main(String[] args) {
        // Create both year objects
        FY firstYear = new FY();
        SY secondYear = new SY();
        
        // Set data for both years
        firstYear.setData(101, "John", "Pass");
        secondYear.setData(102, "John", "First Class");
        
        // Display both
        firstYear.display();
        secondYear.display();
    }
}
