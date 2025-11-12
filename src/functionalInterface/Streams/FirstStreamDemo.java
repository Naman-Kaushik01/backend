package functionalInterface.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //LIST : EVEN NUMBER from "numbers" list
        List<Integer> evenNumbers1 = new ArrayList<>();

        for(int i:numbers){
            if(i%2==0){
                evenNumbers1.add(i);
            }
        }
        System.out.println("Even numbers without streams " + evenNumbers1);

        //ITERATION 2 - USING STREAMS

        Stream<Integer> integerStream = numbers.stream();
        Stream<Integer> integerStream2 = integerStream.filter(p2);
        List<Integer> evenNumbers2 = integerStream2.toList();
        System.out.println("Even numbers with streams 2" + evenNumbers2);

        //ITERATION 3 : We are doing without creating predicate object

        List<Integer> evenNumbers3 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Even numbers with streams 3" + evenNumbers3);

    }
    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int remainder = integer%2;
            if(remainder==0){
                return true;
            }
            return false;
        }
    };

    //way 2 of defining predicate

    static Predicate<Integer> p2 = (integer ->  integer % 2 == 0);
}
