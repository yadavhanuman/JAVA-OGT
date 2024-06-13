import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.nextLine();

       
        File file = new File(fileName);

        // Delete the file
        if (file.delete()) {
            System.out.println("File " + fileName + " was deleted successfully.");
        } else {
            System.out.println("Failed to delete the file. ");
        }

        
        scanner.close();
    }
}
