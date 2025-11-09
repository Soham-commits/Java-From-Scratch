interface Sayable {
    void say();              // no parameter
}

interface Square {
    int calc(int x);         // single parameter
}

interface Addable {
    int add(int a, int b);   // double parameter
}

public class LambdaDemo {
    public static void main(String[] args) {

        // No parameter
        Sayable s = () -> System.out.println("Hello Soham 👋 (No parameter)");
        s.say();

        // Single parameter
        Square sq = (x) -> x * x;
        System.out.println("Square: " + sq.calc(5));

        // Double parameter
        Addable add = (a, b) -> a + b;
        System.out.println("Sum: " + add.add(10, 20));
    }
}