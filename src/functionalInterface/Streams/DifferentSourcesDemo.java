package functionalInterface.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
    /*
    We can make streams from
    Collections : eg.., collection.stream
    From Arrays : eg.., Arrays.stream(array)
    From Specific Values : eg.., Stream.of("a","b","c").
    From Functions : eg.., Stream.iterate(0, n-> n+2);
    From Files : eg.., Files.lines(path);
    Empty Stream : eg.., Stream.empty()

     */
    static void main(String[] args) throws IOException {
//
//        Collections : eg.., collection.stream

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> integerStream = numbers.stream();
        integerStream.forEach(System.out::println);

//        From Arrays : eg.., Arrays.stream(array)

        int[] numberArray = {1, 2, 3, 4, 5};
        IntStream arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);

//        From Specific Values : eg.., Stream.of("a","b","c").

        Stream<String> stringStream = Stream.of("A", "B", "C");
        stringStream.forEach(System.out::println);

//        From Functions : eg.., Stream.iterate(0, n-> n+2)

        Stream<Integer> integerStream1 = Stream.iterate(0, i -> i + 1);
        integerStream1.forEach(System.out::println);

//        From Files : eg.., Files.lines(path);

        Stream<String> fileStream = Files.lines(Path.of("PATH"));

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);






    }
}
