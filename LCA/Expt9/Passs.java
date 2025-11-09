import java.util.*;

public class Passs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try {
            if (!pass.equals("soham123"))
                throw new Exception("Authentication Failure!");
            System.out.println("Login Successful ✅");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}