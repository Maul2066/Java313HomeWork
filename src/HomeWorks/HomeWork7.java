package HomeWorks;

public class HomeWork7 {
    public static void main(String[] args) {
        int a = 1;
        while (a < 2) {
            int b = 0;
            while (b < a) {
                System.out.printf("*%n**%n*%-1s*%n*%-2s*", "", "");
                b++;
            }
            System.out.printf("%n*****");
            a++;
        }
    }
}


