package HomeWorks;

import java.util.Scanner;

public class HomeWork30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Первое слово: ");
        String st1 = input.next();
        System.out.print("Второе слово: ");
        String st2 = input.next();
        Word_length wordLength = new Word_length() {
            @Override
            public void calculate(int word_1, int word_2) {
                if (word_1 < word_2){
                    System.out.println("Самое короткое слово: " + st1);
                } else if (word_2 < word_1) {
                    System.out.println("Самое короткое слово: " + st2);
                } else {
                    System.out.println("Слова одинаковой длины.");
                }
            }
        };
        wordLength.calculate(st1.length(), st2.length());
    }
}

interface Word_length {
    void calculate(int word_1, int word_2);
}

