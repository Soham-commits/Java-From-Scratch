import java.util.Scanner;

public class count{
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String input = sc.nextLine();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(Character.isLetter(input.charAt(i))) {
                count++;
            }
        }
        System.out.println("The number of letters in the string is: " + count);
        sc.close();
    }
} 