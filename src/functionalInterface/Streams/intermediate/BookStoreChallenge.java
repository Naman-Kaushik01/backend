package functionalInterface.Streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BookStoreChallenge {
    public static void main(String[] args) {
        /*
        -Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $20. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
                Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
             by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
                Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.

          */
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


        //Discounted Books: Identify all books that are priced over $20
        System.out.println("All books that are priced over $20");

        Stream<Book> discountedBooks = books.stream()
                .filter(book -> book.price > 20);
        discountedBooks.forEach(System.out::println);

        // books that were published before the year 2000.
        System.out.println("books that were published before the year 2000.");
        Stream<Book> publishedBefore2000 = books.stream()
                .filter(book ->book.publicationYear < 2000);
        publishedBefore2000.forEach(System.out::println);

        // adding the suffix "(Coming Soon)" to all the current titles.

        System.out.println("adding the suffix \"(Coming Soon)\" to all the current titles.");
        books.stream()
                .map(book -> book.title + "(coming Soon)")
                .forEach(System.out::println);

        //Sort by Price
        System.out.println("Sorting by Price in ascending order");
        books.stream()
                .sorted(Comparator.comparingDouble(book -> book.price))
                .forEach(System.out::println);

        // A rare book is one where the title has more than 20
        //            characters
        System.out.println("A rare book is one where the title has more than 20\n" +
                "            characters");
        books.stream()
                .filter(book -> book.title.length() > 20)
                .forEach(System.out::println);

    }
}
