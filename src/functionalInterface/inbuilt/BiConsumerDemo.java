package functionalInterface.inbuilt;

import java.util.function.BiConsumer;
//Represents an operation that accepts two input arguments and returns no result.
public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("Addition : "+(a + b));
        biConsumer.accept(15, 10);
    }
}
