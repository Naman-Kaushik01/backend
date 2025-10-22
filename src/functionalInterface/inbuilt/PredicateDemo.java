package functionalInterface.inbuilt;
//Represents a predicate (boolean-valued function) of one argument.

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));

        BiPredicate<Integer,Integer> isSumEven = (a ,b) -> a % b == 0;
        System.out.println(isSumEven.test(4, 7));
        System.out.println(isSumEven.test(7, 7));
    }
}
