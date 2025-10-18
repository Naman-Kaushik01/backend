package collectionFramework;

import java.util.ArrayList;
import java.util.List;
class Car{
    String brand;
    Car(String brand){
        this.brand=brand;
    }
}
public class ListDemo {

    static void main(String[] args) {
        List<String> user = new ArrayList<>();
        user.add("Alice");
        user.add("Bob");
        user.add("Carl");
        user.add("David");

        for(Object users : user){
            System.out.println(users);
        }
        System.out.println("Element using index :" + user.getFirst());

        //LIST OF OBJECTS

        Car car = new Car("BMW");
        Car car2 = new Car("Ford");
        Car car3 = new Car("Toyota");

        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        System.out.println("List Of Cars");
        for(Car cars : carList){
            System.out.println(cars.brand);
        }

    }
}
