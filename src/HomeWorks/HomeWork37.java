package HomeWorks;

import java.util.stream.Stream;

public class HomeWork37 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(3,4,2,5,1);
        integerStream.skip(1).limit(3).forEach(MiddleNumbers -> System.out.println(MiddleNumbers * 2));
    }
}