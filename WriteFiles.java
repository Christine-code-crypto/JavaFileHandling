import java.io.FileWriter;
import java.io.IOException;
public class WriteFiles {
    public static void main(String[] args) {
        try{
            FileWriter myFileWriter = new FileWriter("Ruby.html");
            myFileWriter.write("I really love programming in java");
            myFileWriter.close();
            System.out.println("Successfully wrote to the file");
        }

        catch(IOException e){ //variable e provides you access to various methods that allow you to get info abt the exception
            System.out.println("An error occured");
            e.printStackTrace();
        }
        /*e: This is the exception object that was caught in the catch block.
         It is an instance of IOException (or any subclass of Exception that you might be handling). 
        The variable e provides access to various methods that allow you to get information about the exception. */

        /*e.printStackTrace(); is a method used to output detailed information about an exception to the console. 
        It provides a stack trace that helps developers understand the context of the error, 
        including the sequence of method calls leading up to the exception,
         which is essential for diagnosing and fixing issues in the code. */
    }
    
}
