package functionalInterface.inbuilt;

import java.util.function.Function;


public class FunctionInterfaceDemo {

    public static Function<Integer , Integer> addFunction =(a)-> a+10;
    public static Function<Integer , Integer> substractFunction =(a)-> a-10;

    public static Function<Integer , Integer> combinedFunction =
            addFunction.andThen(substractFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(15));
        System.out.println(substractFunction.apply(15));
        System.out.println(combinedFunction.apply(15));
    }
}
