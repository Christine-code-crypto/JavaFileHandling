import java.io.File;
public class DeleteFiles{
    public static void main(String[] args) {
        File myobj = new File("Ruby.txt");
        if(myobj.delete()){
            System.out.println("Deleted the file" +myobj.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
        
    }

}