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
        System.out.println(optionalString.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());

        //Get : if you are not sure that value is present or not don't use get

        System.out.println(optionalString.get()); // if value will not availaible it will give exception

        /*
        How to retrieve value from optional safely ?
        1. orElse()
        2. orElseGet()
        3. orElseThrow()
         */

        // orElse("default-value")
        System.out.println(optionalString.orElse("Default Value"));
        System.out.println(mayBe.orElse("Default value"));

        //orElseGet(<supplier>)
        String result = mayBe.orElseGet(()->{
            System.out.println("Generating Default value");
            return "Default value";
        });
        System.out.println(result);

        String result2 = optionalString.orElseGet(()->{
            System.out.println("Generating Default value");
            return "Default value";
        });
        System.out.println(result2);

        //orElseThrow() - return if value present or you can throw an exception too
        String newResult = mayBe.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult);



    }
}
