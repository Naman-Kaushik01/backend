package functionalInterface.Streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationChallengeDemo {
    public static void main(String[] args) {
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
        //Total Cost of all books in the bookStore
        System.out.println("Total Cost of all books in the bookStore");
        Double bookCost = books.stream()
                .mapToDouble(book-> book.price )
                .reduce(0,Double::sum);
        System.out.println(bookCost);

        //Collecting books into a list of titles
        List<String> bookTitles = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());
        System.out.println(bookTitles);

        // Grouping Books by category

        Map<String, List<Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
        byCategory.forEach((category, bookList) -> {
            bookList.forEach(System.out::println);
        });

    }
    static Function<Book , String> bookStringFunction = new  Function<Book , String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}
