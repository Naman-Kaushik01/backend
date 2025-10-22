package functionalInterface;

@FunctionalInterface
interface BookAction {
    public void bookAction();
}

//Functional Interface with Parameters

interface Operation{
    int add(int a,int b);
}



public class FunctionalInterfaceDemo {
    static void main(String[] args) {
        //STEP 1
        BookAction bookAction = new BookAction() {
        @Override
        public void bookAction() {
            System.out.println("bookAction");
        }
    };

        //STEP 2
        BookAction action2 = () ->{
            System.out.println("Action Performed");
        };

        // STEP 3

        BookAction action3 = () -> System.out.println("Action Performed");

    Operation add = (int a,int b) ->{
        System.out.println("add Operation Performed");
        return a+b;
    };
    System.out.println(add.add(1,2));

    //THREAD INTERFACE
        new Thread(()->System.out.println("New Thread Created")).start();

    }
}
