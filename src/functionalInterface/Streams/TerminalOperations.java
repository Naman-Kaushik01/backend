package functionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        //reduce()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> numbersStream = numbers.stream();
//        int sum = numbersStream.reduce(0,(acc,num)->acc + num);
        int sum = numbersStream.reduce(0, Integer::sum);
        System.out.println("SUM : " + sum);

        //collect()
        List<Integer> evenNumbers =numbers.stream()
                .filter(n-> n % 2 == 0)
//                .collect(Collectors.toList());
                .toList();
        evenNumbers.forEach(System.out::println);

        Set<Integer> evenNumbersSet =numbers.stream()
                .filter(n-> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("evenNumbersSet : " + evenNumbersSet);

        //Find & match
        numbers.stream().findFirst().ifPresent(System.out::println);
        numbers.stream().findAny().ifPresent(System.out::println);

        boolean has40 = numbers.stream()
                .anyMatch(n -> n==40);
        System.out.println(has40);

    }
}
