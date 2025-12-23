package functionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        //reduce()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> numbersStream = numbers.stream();
//        int sum = numbersStream.reduce(0,(acc,num)->acc + num);
        int sum = numbersStream.reduce(0, Integer::sum);
        System.out.println("SUM : " + sum);

    }
}
