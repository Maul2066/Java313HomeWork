package HomeWorks;

import java.util.Arrays;

public class HomeWork14 {
    public static void main(String[] args) {
        int [] array = new int[] {-2, 3, 8, -11, -4, 6};
        int count = 0;
        int i = 0;
        System.out.println(Arrays.toString(array));
        System.out.print("n = ");
        System.out.print(Result(i, array,count));

    }
        public static int Result(int i, int[] array, int count) {
            if (i == (array.length)) {
                return count;
            }
            else if (array[i] < 0){
                count++;
            }
            return Result(i + 1, array, count);
    }
}
