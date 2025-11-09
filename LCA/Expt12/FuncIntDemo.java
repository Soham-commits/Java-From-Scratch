import java.util.function.*;

public class FuncIntDemo {
    public static void main(String[] args) {

        // Consumer: takes a value and performs an action (prints it)
        Consumer<String> consumer = name -> System.out.println("Hello, " + name + " 👋");
        consumer.accept("Soham");

        // Supplier: no input, just returns a value
        Supplier<Double> supplier = () -> Math.random(); // returns a random number
        System.out.println("Random number: " + supplier.get());

        // Predicate: takes a value, returns boolean
        Predicate<Integer> predicate = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + predicate.test(10));
        System.out.println("Is 7 even? " + predicate.test(7));
    }
}