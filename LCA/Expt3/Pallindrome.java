import java.util.Scanner;

public class Pallindrome{
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String input = sc.nextLine();
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}