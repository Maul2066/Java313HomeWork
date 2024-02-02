package HomeWorks;

import java.util.Scanner;

public class HomeWork16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        //Замените в этой строке все появления буквы "о" на букву "О", кроме первого и последнего вхождения.
        String input = scanner.nextLine();
        int Start = input.indexOf('о');
        int End = input.lastIndexOf('о');
        char [] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'о') {
                array[i] = 'О';
                if (array[i] == array[End]) {
                    array[i] = 'о';
                } else if(array[i] == array[Start]){
                    array[i] = 'о';
                }
            }
        }
        System.out.println(array);
    }
}
