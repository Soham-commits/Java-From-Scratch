import java.util.Scanner;

public class Pass{

    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        String setPassword = "secret123"; // You can change this password
        System.out.print("Enter password: ");
        String userPassword = sc.nextLine();
        if(setPassword.equals(userPassword)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied. Incorrect password.");
        }
        sc.close();
    }
}