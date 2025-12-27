package day7OptionalInterface;

import java.sql.Struct;

public class NullPointerExceptionDemo {
    public  static void main(String[] args) {
        String name = null;
        //Traditional Way to handle null pointer exception
        if (name == null) {
            System.out.println("Name is null");
        }else {
            System.out.println(name.length() );
        }



    }
}
