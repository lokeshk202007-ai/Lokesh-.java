import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        int[] a = {-5, 5, -3, 3, 7, -7, 7};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(Math.abs(a[i]));
        }

        System.out.println("Number of distinct absolute values = " + set.size());
    }
}
