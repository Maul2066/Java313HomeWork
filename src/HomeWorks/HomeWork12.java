package HomeWorks;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("1 - Прямоугольник,2 -Треугольник , 3 - Круг: ");
        int q = input.nextInt();
        if (q == 1) {
            double a,b;
            System.out.print("Введите ширину: ");
            a = input.nextInt();
            System.out.print("Введите высоту: ");
            b = input.nextInt();
            result(a,b);
        } else if (q == 2) {
            double a,b,c,P = 0, S = 0;
            System.out.print("Введите сторону a = ");
            a =  input.nextInt();
            System.out.print("Введите сторону b = ");
            b = input.nextInt();
            System.out.print("Введите сторону c = ");
            c = input.nextInt();
            result1(a ,b ,c , P , S);
        } else if (q == 3){
            double a, S;
            System.out.print("Введите радиус: ");
            a = input.nextInt();
            result2(a);
        } else {
            System.out.print("Ошибка. Вы ввели неправильное значение!");
        }
    }
    public static void result(double a, double b) {

        System.out.println(a * b / 2);
    }

    public static void result1 (double a1, double b1, double c1, double P, double S){
        P = (a1 + b1 + c1) / 2;
        S = Math.sqrt(P * (P - a1) * (P - b1) * (P - c1));
        System.out.printf("%.2f",S);
    }
    public static void result2 (double c ){
        System.out.printf("%.2f",Math.PI * c * c);

    }
}
