import java.util.Scanner;

public class Factorial {
    // Method to calculate factorial
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating factorial
        long result = factorial(number);

        // Displaying the result
        System.out.println("The factorial of " + number + " is " + result);
    }
}

