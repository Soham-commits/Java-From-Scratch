import java.util.*;

// Ultra concise Set interface demo: HashSet (no order), LinkedHashSet (insertion order), TreeSet (sorted)
class SetDemo {
	public static void main(String[] args) {
		Set<String> hash = new HashSet<>();
		hash.add("B"); hash.add("A"); hash.add("C"); hash.add("A"); // duplicate A ignored
		System.out.println("HashSet: " + hash); // order arbitrary

		Set<String> linked = new LinkedHashSet<>();
		linked.add("B"); linked.add("A"); linked.add("C"); linked.add("A");
		System.out.println("LinkedHashSet: " + linked); // insertion order

		Set<String> tree = new TreeSet<>();
		tree.add("B"); tree.add("A"); tree.add("C"); tree.add("A");
		System.out.println("TreeSet: " + tree); // natural sort

		// Common operations
		System.out.println(hash.contains("A")); // true
		hash.remove("B");
		System.out.println(hash.size());
		for (String s : hash) System.out.print(s + " ");
		System.out.println();
	}
}
