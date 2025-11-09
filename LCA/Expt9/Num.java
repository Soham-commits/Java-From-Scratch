import java.util.*;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num % 2 != 0)
                throw new Exception("Number is not even!");
            System.out.println("Even number ✅");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}