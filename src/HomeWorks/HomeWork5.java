package HomeWorks;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество часов от 0 до 23: ");
        int time;
        time = input.nextInt();

        switch ((time >= 0 && time <= 5) ? 1 :
               (time >= 6 && time <= 12) ? 2 :
               (time >= 13 && time <= 16) ? 3 :
               (time >= 17 && time <= 23) ? 4 : 5) {
             case 1 -> System.out.println("Доброй ночи!");
             case 2 -> System.out.println("Доброе утро!");
             case 3 -> System.out.println("Добрый день!");
             case 4 -> System.out.println("Добрый вечер!");
             case 5 -> System.out.println("Ошибка! Вы ввели несуществующее значение.");
        }
    }
}