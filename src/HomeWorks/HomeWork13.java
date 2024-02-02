package HomeWorks;

import java.util.Arrays;

public class HomeWork13 {
    public static void main(String[] args){
        int [] array = new int[]{3,8,9,4,1,2,5};
        int [] array1 = new int[]{1,2,5};
        System.out.printf("%s%n%s%n%n",Arrays.toString(array), Arrays.toString(array1));
        Result(array);
        Result(array1);
    }
    public static void Result(int... Array){
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (max < Array[i]){
                max = Array[i];
            }
        }
        System.out.println(max);
    }
}
