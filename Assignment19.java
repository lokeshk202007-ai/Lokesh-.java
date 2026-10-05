public class ExceptionExample {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            // Array index out of bounds
            System.out.println(numbers[5]);

            // Arithmetic exception
            int result = 10 / 0;
            System.out.println(result);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception.");
        }

        finally {
            System.out.println("Finally block is executed.");
        }
    }
}
