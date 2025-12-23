package functionalInterface.Streams.intermediate;

import java.util.List;

public class ErrorHandlingStreams {
    public static void main(String[] args) {
        List<String> books = List.of("Java" , "Python" , "C#" , "JavaScript");
        books.stream()
                .forEach(b ->{
                    try {
                        if(b.equals("Python")){
                            throw new Exception("Python Exception");
                        }
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                });

    }
}
