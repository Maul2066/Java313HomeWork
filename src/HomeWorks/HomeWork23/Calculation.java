package HomeWorks.HomeWork23;

public class Calculation {
    static int count;
    public static double Herons_formula (int a, int b, int c){
        count++;
        System.out.printf("%s%d%s%s%s%d%s", "Площадь треугольника по формуле Герона (", a, ",", b, ",", c, "): ");
        int P = (a + b + c) / 2;
        return Math.sqrt(P * (P - a) * (P - b) * (P - c));
    }

    public static int Square_area (int a){
        count++;
        System.out.printf("%s%d%s", "Площадь квадрата (", a, "): ");
        return a * a;
    }

    public static int Area_of_a_rectangle (int a, int b){
        count++;
        System.out.printf("%s%d%s%d%s", "Площадь прямоугольника (", a, ",", b, "): ");
        return a * b;
    }

    public static double Area_of_a_triangle__a_h (int a, int h){
        count++;
        System.out.printf("%s%d%s%d%s", "Площадь треугольника через основание и высоту (", a, ",", h, "): ");
        return (double) (a * h) / 2;
    }

    public static int count (){
        System.out.print("Количество подсчетов площади: ");
        return count;
    }
}
