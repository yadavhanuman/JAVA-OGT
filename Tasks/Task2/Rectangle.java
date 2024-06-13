import java.util.Scanner;

class Rectangle {
    
    double length;
    double breadth;

  
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   
    double calculateArea() {
        return length * breadth;
    }

    
    void displayArea() {
        System.out.println("The area of the rectangle is: " + calculateArea());
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

       
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        
        Rectangle rectangle = new Rectangle(length, breadth);

        
        rectangle.displayArea();

       
        scanner.close();
    }
}
