package HomeWorks;

import java.util.Scanner;
import java.util.TreeSet;

public class HomeWork34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            int n = input.nextInt();
            array[i] = n;
        }

        TreeSet<Min> minTreeSet = new TreeSet<>();
        Min number = new Min(array[0]);
        Min number1 = new Min(array[1]);
        Min number2 = new Min(array[2]);
        Min number3 = new Min(array[3]);
        Min number4 = new Min(array[4]);
        minTreeSet.add(number);
        minTreeSet.add(number1);
        minTreeSet.add(number2);
        minTreeSet.add(number3);
        minTreeSet.add(number4);
        System.out.println("Наименьший элемент в TreeSet:" + minTreeSet.first());
    }
}

class Min implements Comparable<Min>{
    int number;

    public Min(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return " " + number;
    }

    @Override
    public int compareTo(Min o){
        return this.number - o.number;
    }
}
