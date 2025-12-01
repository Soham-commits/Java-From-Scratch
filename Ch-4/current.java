import java.time.LocalDateTime;
import java.util.function.Supplier;

public class current {
    public static void main(String[] args) {
        // Supplier generates current timestamp
        Supplier<LocalDateTime> timestamp = () -> LocalDateTime.now();
        
        // Get current timestamp
        System.out.println("Current timestamp: " + timestamp.get());
        
        // Get it again (different time)
        System.out.println("Current timestamp: " + timestamp.get());
    }
}
