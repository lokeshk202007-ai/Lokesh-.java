public class TwoSum {
    public static void main(String[] args) {

        int[] a = {2, 7, 11, 15};
        int target = 9;

        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("[-1, -1]");
        }
    }
}
