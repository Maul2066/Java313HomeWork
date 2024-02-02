package HomeWorks;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int c = 0; c < array.length; c++) {
            for (int i = 0; i < array.length; i++) {
                if (array[0] == array[1] || array[0] == array[2] || array[0] == array[3]
                        || array[0] == array[4] || array[0] == array[5] || array[0] == array[6] ||
                        array[0] == array[7] || array[0] == array[8] || array[0] == array[9]) {
                    array[0] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[1] == array[0] || array[1] == array[2] || array[1] == array[3]
                        || array[1] == array[4] || array[1] == array[5] || array[1] == array[6] ||
                        array[1] == array[7] || array[1] == array[8] || array[1] == array[9]) {
                    array[1] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[2] == array[1] || array[2] == array[0] || array[2] == array[3]
                        || array[2] == array[4] || array[2] == array[5] || array[2] == array[6] ||
                        array[2] == array[7] || array[2] == array[8] || array[2] == array[9]) {
                    array[2] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[3] == array[1] || array[3] == array[2] || array[3] == array[0]
                        || array[3] == array[4] || array[3] == array[5] || array[3] == array[6] ||
                        array[3] == array[7] || array[3] == array[8] || array[3] == array[9]) {
                    array[3] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[4] == array[1] || array[4] == array[2] || array[4] == array[3]
                        || array[4] == array[0] || array[4] == array[5] || array[4] == array[6] ||
                        array[4] == array[7] || array[4] == array[8] || array[4] == array[9]) {
                    array[4] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[5] == array[1] || array[5] == array[2] || array[5] == array[3]
                        || array[5] == array[4] || array[5] == array[0] || array[5] == array[6] ||
                        array[5] == array[7] || array[5] == array[8] || array[5] == array[9]) {
                    array[5] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[6] == array[1] || array[6] == array[2] || array[6] == array[3]
                        || array[6] == array[4] || array[6] == array[5] || array[6] == array[0] ||
                        array[6] == array[7] || array[6] == array[8] || array[6] == array[9]) {
                    array[6] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[7] == array[1] || array[7] == array[2] || array[7] == array[3]
                        || array[7] == array[4] || array[7] == array[5] || array[7] == array[6] ||
                        array[7] == array[0] || array[7] == array[8] || array[7] == array[9]) {
                    array[7] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[8] == array[1] || array[8] == array[2] || array[8] == array[3]
                        || array[8] == array[4] || array[8] == array[5] || array[8] == array[6] ||
                        array[8] == array[7] || array[8] == array[0] || array[8] == array[9]) {
                    array[8] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[9] == array[1] || array[9] == array[2] || array[9] == array[3]
                        || array[9] == array[4] || array[9] == array[5] || array[9] == array[6] ||
                        array[9] == array[7] || array[9] == array[8] || array[9] == array[0]) {
                    array[9] = (int) (Math.random() * 10);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
