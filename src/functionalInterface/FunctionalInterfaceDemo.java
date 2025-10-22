package functionalInterface;

@FunctionalInterface
interface BookAction {
    public void bookAction();
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


    bookAction.bookAction();
    }
}
