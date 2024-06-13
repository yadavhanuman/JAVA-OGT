import java.util.Scanner;

class Calculator {
   
    double add(double num1, double num2) {
        return num1 + num2;
    }

   
    double subtract(double num1, double num2) {
        return num1 - num2;
    }


    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    
    double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        Calculator calculator = new Calculator();

        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

       
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

       
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

     
        switch (operation) {
            case '+':
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case '/':
                System.out.println("Result: " + calculator.divide(num1, num2));
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }

        
        scanner.close();
    }
}
