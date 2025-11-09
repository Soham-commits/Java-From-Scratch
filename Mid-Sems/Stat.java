import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

public class Stat {
    public static void main(String[] args) {
        // With static import, we use the static members directly
        out.println("The square root of 25 is " + sqrt(25));
        out.println("2 to the power of 4 is " + pow(2, 4));
    }
}
