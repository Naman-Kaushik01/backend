package functionalInterface.inbuilt;

import java.util.function.Supplier;

public class SupplierDemo {
    static void main(String[] args) {
        Supplier<Double> random = Math::random;
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
    }
}
