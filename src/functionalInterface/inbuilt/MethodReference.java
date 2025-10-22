package functionalInterface.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    static void main(String[] args) {

        //1 Using For loop
        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");
//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }
//
//        //2 using enhanced for loop
//        for(String name : names){
//            System.out.println(name);
//        }

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });

//        names.forEach((String name)->{
//            System.out.println(name);
//        });

//        names.forEach((name)->System.out.println(name));

        //This is the best way
        names.forEach(System.out::println);

    }
}
