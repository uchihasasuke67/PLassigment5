import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Проверка наличия входных данных
        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long k = scanner.nextLong();

        if (n > 1) {
            // Вычисляем эффективное количество сдвигов вправо
            long steps = k % n;
            if (steps < 0) {
                steps += n;
            }

            int s = (int) steps;
            if (s > 0) {
                // Алгоритм тройного разворота (in-place сдвиг)
                reverse(arr, 0, n - 1);     // 1. Разворачиваем весь массив
                reverse(arr, 0, s - 1);     // 2. Разворачиваем первые s элементов
                reverse(arr, s, n - 1);     // 3. Разворачиваем оставшиеся элементы
            }
        }

        // Вывод результата через пробел
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    // Вспомогательный метод для разворота участка массива на месте
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}