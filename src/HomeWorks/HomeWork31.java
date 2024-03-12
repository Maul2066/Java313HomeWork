package HomeWorks;

import java.util.function.Predicate;

public class HomeWork31 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = getNumber -> {
            if (getNumber % 3 == 0 ||getNumber % 4 == 0 || getNumber % 5 == 0 || getNumber % 7 == 0 || getNumber % 8 == 0 || getNumber % 9 == 0){
                if (getNumber == 5 || getNumber == 3 || getNumber == 7){
                    return true;
                } else {
                    return false;
                }
            } else if (getNumber % 2 == 1 || getNumber == 2){
                if (getNumber == 1){
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        };

        int Number = 7;
        boolean result = predicate.test(Number);
        System.out.println(Number + " является простым числом: " + result);

        System.out.println();

        int Number1 = 12;
        boolean result1 = predicate.test(Number1);
        System.out.println(Number1 + " является простым числом: " + result1);
    }
}
