import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Input rate of interest
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Input time period in years
        System.out.print("Enter the time period (in years): ");
        int time = scanner.nextInt();

        // Calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);
    }

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}

