package day7OptionalInterface;

import java.sql.Struct;
import java.util.Optional;

public class NullPointerExceptionDemo {
    public  static void main(String[] args) {
        String name = null;
        //Traditional Way to handle null pointer exception
        if (name == null) {
            System.out.println("Name is null");
        }else {
            System.out.println(name.length() );
        }

        // Creating Optional

        Optional<String> optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        //To insert null value we should use ofNullable instead of "of"
        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        //Checking Values
        System.out.println(mayBe.isPresent());
        System.out.println(mayBe.isEmpty());

        //get : if not sure that value is present or not don't use get it will give exception
        System.out.println(optionalString.get());

        /*How to retrieve value from optional safely ?
         We have three methods :
         1. orElse()
         2.orElseGet()
         3.orElseThrow()
         */




    }
}
