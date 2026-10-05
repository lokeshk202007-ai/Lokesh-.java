public class Sorting {

    public static void main(String[] args) {

        int[] a = {64, 25, 12, 22, 11};

        // Selection Sort
        int[] selection = a.clone();

        for (int i = 0; i < selection.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < selection.length; j++) {
                if (selection[j] < selection[min]) {
                    min = j;
                }
            }

            int temp = selection[i];
            selection[i] = selection[min];
            selection[min] = temp;
        }

        System.out.println("Selection Sort:");
        for (int n : selection) {
            System.out.print(n + " ");
        }

        // Insertion Sort
        int[] insertion = a.clone();

        for (int i = 1; i < insertion.length; i++) {
            int key = insertion[i];
            int j = i - 1;

            while (j >= 0 && insertion[j] > key) {
                insertion[j + 1] = insertion[j];
                j--;
            }

            insertion[j + 1] = key;
        }

        System.out.println("\nInsertion Sort:");
        for (int n : insertion) {
            System.out.print(n + " ");
        }
    }
}
