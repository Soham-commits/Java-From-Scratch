import java.util.Scanner;

public class rangee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        if (start <= end && start >= 0) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers in the range: " + sum);
        } else {
            System.out.println("Invalid range. Make sure the start is less than or equal to the end and both are non-negative.");
        }

        scanner.close();
    }
}
