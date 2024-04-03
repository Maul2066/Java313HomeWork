package HomeWorks;

import java.util.ArrayList;
import java.util.List;

public class HomeWork38 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(20);
        arrayList.add(33);
        arrayList.add(45);
        arrayList.add(52);
        List<Integer> calculate = arrayList.stream().filter(s -> s % 4 == 0).reduce((x, y) -> (x * 2) + (y * 2)).stream().toList();
        System.out.println(arrayList + ": " + calculate.get(0));
    }
}
