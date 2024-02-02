import java.util.Scanner;
public class HomeWork20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество символов: ");
        int input = scanner.nextInt();
        StringBuilder str1 = new StringBuilder();
        String str2 = "";
        for (int i = 0; i < input; i++) {
            if ((i & 1) == 0){
                str1.append("X ");
            } else if ((i & 1) == 1) {
                str1.append("0 ");
            }

        }
        str2 = String.valueOf(str1);
        String First_change = str2.replace("X", "0");
        String Last_change = First_change.replace(" 0 ", " X ");
        str2 = Last_change;
        for (int i = 0; i < input; i++) {
            if ((i & 1) == 0){
                System.out.println(str1);
            } else if ((i & 1) == 1) {
                System.out.println(str2);
            }
        }
    }
}
