import java.util.Scanner;

public class AddComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        double realSum = real1 + real2;
        
        // Displaying the result
        System.out.println("The sum of the two complex numbers is: " + realSum );
    }
}

