package functionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Streams --> Assembly line / pipeline

        List<String> items = Arrays.asList("Apple" , "Banana", "Pear");
        items.forEach(System.out::println);

        //Using Streams
        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);

        //WAY 1
        System.out.println("------printing name starts with B--------");
        Stream<String> stream1 = items.stream();
       Stream<String> filterStream = stream1.filter(name -> name.startsWith("B"));
       filterStream.forEach(System.out::println);

        System.out.println("-------Printing name starts with A--------");

        // way 2
        items.stream().filter(name-> name.startsWith("A")).forEach(System.out::println);

        /*
        USE CASES
        1.Filtering
        2.Mapping
        3.Aggregation
        4.Searching
        5.Iteration
         */
    }
}
