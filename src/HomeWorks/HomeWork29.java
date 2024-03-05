package HomeWorks;
import java.util.Scanner;

public class HomeWork29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int i = input.nextInt();
        Integer[] numbersArray = new Integer[i];
        for (int j = 0; j < numbersArray.length; j++) {
            System.out.print("-> ");
            numbersArray[j] = input.nextInt();
        }

        System.out.print("Введите количество элементов массива строк: ");
        int s = input.nextInt();
        String[] wordsArray = new String[s];
        for (int j = 0; j < wordsArray.length; j++) {
            System.out.print("-> ");
            wordsArray[j] = input.next();
        }

        printArray<Integer> Array_1 = new printArray<>(numbersArray);
        printArray<String> Array_2 =  new printArray<>(wordsArray);
        Array_1.information();
        Array_2.information();
    }
}
class printArray<T>{
    public T[] ARRAYS;

    public printArray(T[] Arrays) {
        this.ARRAYS = Arrays;
    }

    void information(){
        System.out.print("Массив: ");
        for (int i = 0; i < ARRAYS.length; i++) {
            System.out.print(ARRAYS[i] + " ");
        }
        System.out.println();
    }
}
