import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < n; i++) {
                int j = i;

                while (j < n && a[j] == a[i]) {
                    j++;
                }

                if (j - i >= 3) {
                    count += j - i;

                    for (int k = j; k < n; k++) {
                        a[k - (j - i)] = a[k];
                    }

                    n -= j - i;
                    changed = true;
                    break;
                }

                i = j - 1;
            }
        }

        System.out.println(count);
    }
}