import java.util.*;

// Concise ArrayList demo: add, insert, get, set, remove, contains, iterate, sort
public class Arr {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Apple"); a.add("Banana"); a.add("Mango");
        a.add(1, "Orange");                 // insert at index
        System.out.println(a);               // [Apple, Orange, Banana, Mango]

        System.out.println(a.get(0));        // get -> Apple
        a.set(2, "Grapes");                  // update index 2
        a.remove("Apple");                   // remove by value
        a.remove(0);                          // remove by index

        System.out.println(a.contains("Mango")); // search -> true/false
        for (String s : a) System.out.print(s + " ");
        System.out.println();
    }
}
