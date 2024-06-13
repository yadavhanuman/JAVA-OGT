import java.util.Scanner;

public class ArrayIndexExceptionHandling {
    public static void main(String[] args) {
      
        int[] numbers = {1, 2, 3, 4, 5};

       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index to access: ");
        try {
            
            int index = scanner.nextInt();

            
            int value = numbers[index];

            
            System.out.println("The value at index " + index + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Array index is out of bounds.");
        } catch (Exception e) {
            
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}
