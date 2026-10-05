import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("HTML");

        System.out.println("LinkedList: " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.remove("Python");
        list.removeFirst();

        System.out.println("After removing elements: " + list);
    }
}
