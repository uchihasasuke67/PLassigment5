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

        if (k < 0) {
            k += n;
        }

        // Reverse the whole array
        reverse(a, 0, n - 1);

        // Reverse the first k elements
        reverse(a, 0, k - 1);

        // Reverse the remaining elements
        reverse(a, k, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }
}
