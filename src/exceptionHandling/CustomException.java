package exceptionHandling;

class BookUnavailableException extends Exception{
    public BookUnavailableException(String message){
        super(message);
    }
}
class InvalidMemberException extends Exception{
    public InvalidMemberException(String message){
        super(message);
    }
}
public class CustomException {
    int availaibleBooks = 9;
    public void borrowBooks(int bookRequestCount , String name) throws Exception{
            if (bookRequestCount > availaibleBooks) {
                throw new BookUnavailableException("Not enough books available");
            }
            if(bookRequestCount < 0){
                throw new Exception("You must request at least 1 book");
            }
            if(name == null || name.isEmpty()) {
                throw new InvalidMemberException("You must provide a name");
            }

    }

    static void main(String[] args) {
        CustomException customException = new CustomException();
        try {
            customException.borrowBooks(3,"");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
