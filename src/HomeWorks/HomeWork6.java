package HomeWorks;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum, count, max_value, min_value;
        double average;
        sum = 0;
        max_value = 0;
        min_value = 0;
        count = 0;
        do {
            System.out.print("Введите число: ");
            num = input.nextInt();
            if (num == 0) {
                num = num;
            } else if (num > max_value && num != 0) {
                max_value = num;
            } else if (num < max_value && num != 0) {
                min_value = num;
            }

            if (num > 0) {
                sum += num;
                count ++;
            }
        }
        while (num != 0);
        average = (double) sum / count;
        System.out.printf("Среднее арифметическое: %.2f%n", average);
        System.out.printf("Минимальное число: %d%n", min_value);
        System.out.printf("Максимальное число: %d", max_value);
    }
}