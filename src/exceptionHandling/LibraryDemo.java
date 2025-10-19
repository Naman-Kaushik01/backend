package exceptionHandling;

class Library{
    int availaibleBooks = 15;
    int booksTaken = 4;

        //try - catch - finally
    public void borrowBooks(int bookRequested){
       try{
           int [] books ={101,102,103,104,105,106,107,108,109,110};
           System.out.println("Book Requested : " + books[bookRequested]);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("You requested a book that does not exist");
       }catch(Exception e){
           System.out.println("Something went wrong");
       }finally {
           System.out.println("finally"); // finally always execute for resource management
       }
    }

    //throw
    public void checkAvailaibility(int bookRequestCount){
        try{
           if (bookRequestCount > availaibleBooks){
               throw new Exception("Not enough books available");
           }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You requested a book that does not exist");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("finally"); // finally always execute for resource management
        }
    }

    //throws

    public void returnBook(int returnBook) throws Exception{
        if(returnBook < booksTaken){
           throw new Exception("Unable to submit !! Return all books you had taken");
        }if(returnBook > booksTaken){
            throw new Exception("You can't submit books more than you taken");
        }
    }
}
public class LibraryDemo {
    static void main(String[] args) {
        Library library = new Library();
        library.borrowBooks(31);
        library.checkAvailaibility(15);

        try {
            library.returnBook(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
