class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class OwnClass {
    static void check(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Not eligible (age < 18)");
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            check(15);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}