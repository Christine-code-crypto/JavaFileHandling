import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException; // Import IOException
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File myFile = new File("Odowa.txt");
            File myFile2 = new File("Ruby.txt");
            myFile.createNewFile();
            Scanner myReader = new Scanner(myFile);
            Scanner myReader2 = new Scanner(myFile2);
            while (myReader.hasNextLine()) {//used to iterate through each line of text available in the scanner object
                String data = myReader.nextLine();
                System.out.println(data);
                
            }
            myReader.close();   //WHY AM I USING DATA TWICE AND THERE IS NO ERROR
            //MUST THE CLOSE BE IN THE TRY BLOCK AND WHY

            while (myReader2.hasNextLine()) {
                String data = myReader2.nextLine();
                System.out.println(data);
                
            }
            myReader2.close();

        }

            catch(FileNotFoundException e){
                System.out.println("An error occured");
                e.printStackTrace();
            }
            catch (IOException e) { // Catch IOException
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

    
    
}
}
