package HomeWorks;

public class HomeWork1 {
    public static void main(String[] args) {
        int num = 97531;
        int a, b, c, d, e, result, result1;
        System.out.printf("Исходное число: %d %n", num);
        a = num % 10;
        num = num / 10;
        b = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        d = num % 10;
        num = num /10;
        e = num % 10;
        System.out.printf(" a = %d %n b = %d %n c = %d %n d = %d %n e = %d %n", a,b,c,d,e);
        result = a * b * c * d * e;
        System.out.printf("Произведение числа 97531: %d %n", result);
        result1 = (a + b + c + d + e) / 5;
        System.out.printf("Среднее арифметическое числа 97531: %d", result1);
    }
}
