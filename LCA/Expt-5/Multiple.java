interface FY {
    void setFYData(int roll, String name, String result);
    void displayFY();
}

interface SY {
    void setSYData(int roll, String name, String result);
    void displaySY();
}

class Student implements FY, SY {
    int fyRoll, syRoll;
    String fyName, syName;
    String fyResult, syResult;

    public void setFYData(int roll, String name, String result) {
        fyRoll = roll; fyName = name; fyResult = result;
    }

    public void setSYData(int roll, String name, String result) {
        syRoll = roll; syName = name; syResult = result;
    }

    public void displayFY() {
        System.out.println("FY: " + fyRoll + ", " + fyName + ", " + fyResult);
    }

    public void displaySY() {
        System.out.println("SY: " + syRoll + ", " + syName + ", " + syResult);
    }

    public void displayBoth() {
        displayFY();
        displaySY();
    }
}

public class Multiple {
    public static void main(String[] args) {
        Student s = new Student();
        s.setFYData(101, "John", "Pass");
        s.setSYData(102, "John", "First Class");
        s.displayBoth();
    }
}
