package functionalInterface.inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    public static void main(String[] args) {
        //<title> costs $<price>
        BiFunction<String , Double , String> formatter = (title , price) ->title +" costs $" + price;
        System.out.println(formatter.apply("Java Basics" , 599.99));
        System.out.println(formatter.apply("Python Basics" , 499.99));
        System.out.println(formatter.apply("C++ Basics" , 199.99));

        BiConsumer<String , Double> formatterConsumer = (title ,price) -> System.out.println(title +" costs $" + price);
        formatterConsumer.accept("DSA Basics" , 459.99);
        formatterConsumer.accept("C Sharp Basics" , 199.99);

        //isExpensive

        Predicate<Double> isExpensive = (price ) -> price >= 500;
        System.out.println(isExpensive.test(599.99));
    }
}
