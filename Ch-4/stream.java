import java.util.Arrays;
import java.util.List;

public class stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        
        // Print each number using lambda
        numbers.stream()
               .forEach(n -> System.out.println(n));
    }
}
