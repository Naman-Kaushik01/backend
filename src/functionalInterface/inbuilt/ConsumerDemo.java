package functionalInterface.inbuilt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Represents an operation that accepts a single input argument and returns no result.
public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer1 = (str)->System.out.println(str);
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("hello");
        consumer1.accept("world");

        Consumer<String> consumer2 = (str) ->System.out.println("Length : " +str.length());
        consumer2.accept("Hey");
        consumer2.accept("guys");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Integer> multiplyByTwo = num -> System.out.println(num * 2);
        numbers.forEach(multiplyByTwo);

    }
}
