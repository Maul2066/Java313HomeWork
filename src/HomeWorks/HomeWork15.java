package HomeWorks;

import java.util.Scanner;

public class HomeWork15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два слова через пробел: ");
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        String[] result = new String[2];
        result[0] = array[1];
        result[1] = array[0];
        System.out.println(result[0] + " " + result[1]);
    }
}
