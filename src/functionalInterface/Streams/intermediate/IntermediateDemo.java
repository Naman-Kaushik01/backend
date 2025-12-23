package functionalInterface.Streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String[]args){
        List<Book> books = Arrays.asList(
                new Book("The Silent Garden", 2018, 17.99, "Fiction"),
                new Book("Cosmic Wonders", 2020, 22.50, "Science"),
                new Book("Echoes in the Rain", 2005, 12.75, "Fiction"),
                new Book("A Life in Code", 2022, 18.00, "Biography"),
                new Book("Java Stream Mastery", 2023, 35.90, "Technology"),
                new Book("The Midnight Library", 2018, 14.50, "Fiction"),
                new Book("Quantum Realm", 2015, 25.99, "Science"),
                new Book("Advanced Spring Boot", 2023, 40.00, "Technology"),
                new Book("The Innovator's Journey", 2019, 16.99, "Biography"),
                new Book("Old Man and the Sea", 1998, 9.99, "Fiction")
        );
        // 1. Filtering: Books cheaper than $20
        Stream<Book> filteredBooks = books.stream()
                .filter(book -> book.price < 20);
        filteredBooks.forEach(System.out::println);

        // 2. Mapping: Convert book titles to uppercase
        Stream<String> upperCaseTitles = books.stream()
                .map(b ->b.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);




    }

    // we can filter book by creating predicate like this also
//    static Predicate<Book> predicate = new Predicate<Book>() {
//        @Override
//        public boolean test(Book t) {
//            return t.price < 20;
//        }
//    };

}
