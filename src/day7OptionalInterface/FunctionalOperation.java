package day7OptionalInterface;

import java.util.Optional;

public class FunctionalOperation {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("John");
        Optional<String> empty = Optional.empty();

        //ifPresent() - do something if value is present
        name.ifPresent(val -> {
            System.out.println(val);
            System.out.println("Hey");
        });
        // it will not print anything
        empty.ifPresent(val -> {
            System.out.println(val);
            System.out.println("Hey");
        });

        //map()
        Optional<String> upperCase = name.map(String::toUpperCase);
        System.out.println(upperCase.orElse("Hey"));

        //filter()
        Optional<String> temp =name.filter(n-> n.startsWith("J"));
        temp.ifPresent(System.out::println);

        //combined operation
        name.filter(n-> n.startsWith("J"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);





    }
}
