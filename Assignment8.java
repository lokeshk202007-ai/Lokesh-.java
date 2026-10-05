public class Main {

    // Method for Fibonacci using recursion
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        // Split sentence and rebuild in reverse order
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");

        System.out.println("Original sentence: " + sentence);
        System.out.print("New format: ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        // Fibonacci series
        int n = 10;

        System.out.println("\n\nFibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
