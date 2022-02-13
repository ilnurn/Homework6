package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] daySpending = new int[30];

        int monthSpending = 0;
        int maximumDaySpending = 100_000;
        int minimumDaySpending = 200_000;

        for (int i = 0; i < daySpending.length; i++) {
            daySpending[i] = (int) ((100 * Math.random() + 100) * 1000);
            System.out.print(daySpending[i] + " ");
            monthSpending += daySpending[i];
            if (daySpending[i] >= maximumDaySpending) {
                maximumDaySpending = daySpending[i];
            }
            if (daySpending[i] <= minimumDaySpending) {
                minimumDaySpending = daySpending[i];
            }
        }
        // Задание 1
        System.out.println();
        System.out.println( "Сумма трат за месяц составила " + monthSpending + " рублей");
        // Задание 2
        System.out.println("Минимальная сумма трат за день составила " + minimumDaySpending + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximumDaySpending + " рублей");
        // Задание 3
        float averageMonthSpending = (float) monthSpending / daySpending.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthSpending + " рублей");

        // Задание 4
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }
        System.out.println();

        // Задание 5
        int a = 1;
        int[][] matrix = {{a, 0, a}, {0, a, 0}, {a, 0, a}};
        for (int[] row : matrix) {
            for (int column : row) {
                if (column == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(column + " ");
                }
            }
            System.out.println();
        }

        // Задание 6
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[(arr.length - 1) - i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));

        // Задание 7
        arr = new int[]{5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr));
        for (int index = 0; index < arr.length / 2; index++) {
            arr[index] = arr[index] + arr[arr.length - 1 - index];
            arr[arr.length - 1 - index] = arr[index] - arr[(arr.length - 1) - index];
            arr[index] = arr[index] - arr[arr.length - 1 - index];
        }
        System.out.println(Arrays.toString(arr));

        // Задание 8
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort (array);
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative = array[i];
            } else {
                if (array[i] > 0) {
                    positive = array[i];
                }
                if (negative + positive == -2) {
                    System.out.println("Задание 8: числа " + negative + " и " + positive);
                }
            }
        }

        // Задание 9
        int[] numbers = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = i + 1; i1 < numbers.length; i1++) {
                if (numbers[i] + numbers[i1] == -2) {
                    int sum = numbers[i] + numbers[i1];
                    System.out.println("Сумма чисел " + numbers[i] +" и " + numbers[i1] + " равна " + sum);
                }
            }
        }
    }
}
