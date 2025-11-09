public class Cat {
    public static void main(String[] args) {
        System.out.println("Starting process...");
        
        try {
            System.out.println("Attempting a risky step...");
            
            // The 'throw' keyword immediately launches an exception.
            // Execution of the 'try' block stops here.
            throw new RuntimeException("Something went wrong!"); 
            
            // The line below is never reached
            // System.out.println("This is skipped."); 
            
        } finally {
            // The 'finally' block is guaranteed to run BEFORE the program crashes.
            System.out.println("✅ FINALLY: Cleanup finished!");
        }
        
        // Since the exception was not caught, the program will crash AFTER 'finally' runs.
        // The JVM will print the full error stack trace here.
    }
}