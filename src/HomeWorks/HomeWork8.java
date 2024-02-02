package HomeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите элементы массива: ");
        int num = input.nextInt();
        int[] array = new int[num];
        System.out.printf("n = %d%n", array.length);
        for (int a = 0; a < array.length; a++) {
            System.out.print("-> ");
            array[a] = input.nextInt();
        }
        int max = array[0];
        for (int a = 0; a < array.length; a++) {
            if (max < array[a]) {
                max = array[a];
            }
        }
        int max1 = array[2];
        for (int a = 5; a < array.length; a++) {
            if (max1 < array[a]) {
                max1 = array[a];
            }
        }
        int max2 = array[3];
        for (int a = 5; a < array.length; a++) {
            if (max2 < array[a]) {
                max2 = array[a];
            }
        }
        System.out.printf("%d%-1s%d%-1s%d", max, "", max1, "", max2);
    }

}