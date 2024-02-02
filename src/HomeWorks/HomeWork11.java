package HomeWorks;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n%s%n%s%-1s",
                "Выбор фигуры:", "1 - Треугольник", "2 - Прямоугольник", "3 - Круг", ":", "");
        int q = input.nextInt();
        if (q == 1) {
            double a,b,c,P, S;
            System.out.print("Введите сторону a = ");
            a =  input.nextInt();
            System.out.print("Введите сторону b = ");
            b = input.nextInt();
            System.out.print("Введите сторону c = ");
            c = input.nextInt();
            P = (a + b + c) / 2;
            S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
            System.out.printf("%.2f",S);
        } else if (q == 2) {
            double a, b;
            System.out.print("Введите ширину: ");
            a = input.nextInt();
            System.out.print("Введите высоту: ");
            b = input.nextInt();
            System.out.printf("%.2f",a * b / 2);
        } else if (q == 3){
            double a, S;
            System.out.print("Введите радиус: ");
            a = input.nextInt();
            S = Math.PI * a * a;
            System.out.printf("%.2f",S);
        } else {
            System.out.print("Ошибка. Вы ввели неправильное значение!");
        }
    }
}
