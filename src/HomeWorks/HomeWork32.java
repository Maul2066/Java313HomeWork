package HomeWorks;

import java.util.ArrayList;

public class HomeWork32 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 101)) ;

        }
        System.out.println(arrayList);
        Max(arrayList);
        Min(arrayList);
        Average(arrayList);
    }
    public static void Max (ArrayList<Integer> array){
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)){
                max = array.get(i);
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
    public static void Min (ArrayList<Integer> arrayList){
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (min > arrayList.get(i)){
                min = arrayList.get(i);
            }
        }
        System.out.println("Минимальный элемент: " + min);
    }
    public static void Average (ArrayList<Integer> arrayList){
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);
        }
        System.out.println("Среднее арифметическое: " + (double) sum / arrayList.size());
    }
}
