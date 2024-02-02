package HomeWorks;

import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Введите число от 1 до 99: ");
        a = input.nextInt();
        b = a % 10;
        if (a == 11 || a == 12 || a == 13 || a == 14) {
            System.out.printf("%d Копеек",a);
        } else if (b == 1) {
            System.out.printf("%d копейка",a);
        } else if (b == 2 || b == 3 || b == 4) {
            System.out.printf("%d копейки",a);
        } else {
            System.out.printf("%d копеек",a);
        }
    }
}
