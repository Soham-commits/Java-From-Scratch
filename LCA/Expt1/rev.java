import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sumOfDigits = 0;
        int reversedNumber = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
