import java.util.Scanner;

public class Primitive{
    public static void main(String[] Args)
    {
        int prim = 10;
        // Primitive to Object (Boxing)
        Integer wrapInt = Integer.valueOf(prim); // Explicit boxing
        Integer autoBox = prim; // Autoboxing
        System.out.println("Primitive to Object (Boxing):");
        System.out.println("wrapInt = " + wrapInt);
        System.out.println("autoBox = " + autoBox);

        // Object to Primitive (Unboxing)
        int unboxed1 = wrapInt.intValue(); // Explicit unboxing
        int unboxed2 = autoBox; // Auto-unboxing
        System.out.println("Object to Primitive (Unboxing):");
        System.out.println("unboxed1 = " + unboxed1);
        System.out.println("unboxed2 = " + unboxed2);
    }
}