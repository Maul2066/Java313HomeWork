package HomeWorks;

import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println("Двумерный массив: ");
        int a, b;
        a = 6;
        b = 6;
        int[][] f = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                f[i][j] = (int) (Math.random() * 11);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(f[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Одномерный массив: ");
        int[] array = new int[6];
        for (int is = 0; is < array.length; is++) {
            array[is] = (int) (Math.random() * 6);
            System.out.print(array[is] + "  ");
        }
        System.out.println();
        System.out.println();
        int count;
        for (int i = 0; i < a; i++) {
            count = i % 2;
            if (count == 1){
                f [i] = array;

            }
            for (int j = 0; j < b; j++) {
                System.out.print(f[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
