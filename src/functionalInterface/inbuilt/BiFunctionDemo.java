package functionalInterface.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static BiFunction<Integer, Integer, Integer> addFunction
            = Integer::sum;

    public static BiFunction<Integer, Integer, Integer> subFunction
            = (a, b) -> a - b;

    static Function<Integer, Integer> multiplyBy2 = a -> a*2;
    public static BiFunction<Integer, Integer, Integer> combinedFunction =
            addFunction.andThen(multiplyBy2);



    static void main(String[] args) {
        System.out.println(addFunction.apply(15, 15));
        System.out.println(addFunction.apply(15, 15));
        System.out.println(subFunction.apply(15, 10));

        System.out.println(combinedFunction.apply(15, 10));

    }
}
