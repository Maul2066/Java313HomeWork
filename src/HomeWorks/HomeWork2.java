package HomeWorks;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How old are you? ");
        int age = input.nextInt();
        System.out.print("Where you live? ");
        String location = input.next();
        System.out.printf("This is %s.%n", name);
        System.out.printf("It is %d.%n", age);
        System.out.printf("He lives in %s.%n", location);

        input.close();
    }
}