import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }

        int groups = 0;
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            if (visited[i])
                continue;

            groups++;
            visited[i] = true;

            char[] a = str[i].toCharArray();
            Arrays.sort(a);

            for (int j = i + 1; j < N; j++) {
                if (!visited[j]) {
                    char[] b = str[j].toCharArray();
                    Arrays.sort(b);

                    if (Arrays.equals(a, b)) {
                        visited[j] = true;
                    }
                }
            }
        }

        System.out.println("Number of anagram groups = " + groups);
    }
}
