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

    }
}
