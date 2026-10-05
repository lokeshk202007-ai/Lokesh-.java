import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Study Java");
        tasks.add("Complete assignment");
        tasks.add("Go to college");

        System.out.println("Tasks:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Removing a task
        tasks.remove("Go to college");

        System.out.println("\nAfter removing a task:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
