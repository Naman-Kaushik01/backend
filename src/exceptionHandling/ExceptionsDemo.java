package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    static void main(String[] args) {
        try {
            //
            int[] a = {1, 2, 3};
            System.out.println(a[4]);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done");

        //Checked Unchecked Exception

        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
