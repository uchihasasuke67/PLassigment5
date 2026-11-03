import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;

        if (k > 0) {
            for (int j = 0; j < k; j++) {
                int temp = a[n - 1];

                for (int i = n - 1; i > 0; i--) {
                    a[i] = a[i - 1];
                }

                a[0] = temp;
            }
        } else {
            for (int j = 0; j < -k; j++) {
                int temp = a[0];

                for (int i = 0; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }

                a[n - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}