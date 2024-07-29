import java.io.File; //import the file class
import java.io.IOException;//Imports the class to handle errors

public class CreateFile{
public static void main(String[] args) {
        
try{
    File myFile = new File("Ruby.html");//// Creates a File object pointing to "Ruby.txt". 
    //myFile.createNewFile();
    //NOTE,,This does not create the file
    if(myFile.createNewFile()){ //This method checks if the file already exists. 
        //If it does not, it creates the file and returns true. 
        //If the file already exists, it does nothing and returns false.
        System.out.println("File created "+ myFile.getName());
    }
    else{
        System.out.println("File already exists");
    }
}
catch(IOException e){ //e: This is a variable that holds the exception object
    //Type: e is of type IOException, which means it can access methods and properties specific to IOException.
    System.out.println("An error occured");
    e.printStackTrace(); //e.printStackTrace(); provides detailed technical information about the exception, including the exception’s type, message, and the stack trace
    

}

}
}
