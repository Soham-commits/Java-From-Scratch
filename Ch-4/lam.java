import java.util.function.Predicate;

public class lam {
    public static void main(String[] args) {
        // Predicate checks if number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        
        int num = 10;
        System.out.println(num + " is even? " + isEven.test(num));
        
        num = 7;
        System.out.println(num + " is even? " + isEven.test(num));
    }
}
