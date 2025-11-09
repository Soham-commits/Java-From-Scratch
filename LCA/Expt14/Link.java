import java.util.*;

// Concise LinkedList demo: add, addFirst/addLast, get, set, remove, contains, iterate
public class Link {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("A"); l.add("B"); l.add("C");    // add at end
		l.addFirst("Start"); l.addLast("End");   // deque-style ops
		System.out.println(l);                    // [Start, A, B, C, End]

		System.out.println(l.get(1));            // get -> A
		l.set(2, "X");                            // set index 2
		l.remove("Start");                        // remove by value
		l.remove(0);                               // remove by index

		System.out.println(l.contains("C"));     // search
		for (String s : l) System.out.print(s + " ");
		System.out.println();
	}
}

