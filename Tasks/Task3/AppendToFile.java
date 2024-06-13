import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file name to append to: ");
        String fileName = scanner.nextLine();

        
        System.out.print("Enter the text to append: ");
        String textToAppend = scanner.nextLine();

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(textToAppend);
            writer.newLine();
            System.out.println("Text has been appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }

        
        scanner.close();
    }
}
