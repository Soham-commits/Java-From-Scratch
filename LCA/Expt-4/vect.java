import java.util.Vector;
import java.util.Scanner;

public class vect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i+1) + ": ");
			int elem = sc.nextInt();
			v.add(elem);
		}
		System.out.println("Vector elements: " + v);
		sc.close();
	}
}
