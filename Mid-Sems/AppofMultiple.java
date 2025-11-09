interface Fy
{
    void setfydata(int roll, String name);
    void displayfy();
}
interface Sy
{
    void setsydata(int roll, String name);
    void displaysy();
}

class Student implements Fy, Sy{
    int Fyroll, Syroll;
    String Fyname, Syname;

    public void setfydata(int roll, String name)
    {
        Fyroll = roll;
        Fyname = name;
    }
    public void setsydata(int roll, String name)
    {
        Syroll = roll;
        Syname = name;
    }
    public void displayfy()
    {
        System.out.println("FY: "+Fyroll+", "+Fyname);
    }
    public void displaysy()
    {
        System.out.println("SY: "+Syroll+", "+Syname);
    }
    void displayboth()
    {
        displayfy();
        displaysy();
    }
}

public class AppofMultiple {
    public static void main(String[] args) {
        Student s = new Student();
        s.setfydata(101, "John");
        s.setsydata(102, "Doe");
        s.displayboth();
    }
}