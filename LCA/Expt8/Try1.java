public class Try1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // this will throw ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed."); // handling ArithmeticException
        } 
        finally {
            System.out.println("Execution finished (finally block)."); // this block always executes
        }
    }
}
