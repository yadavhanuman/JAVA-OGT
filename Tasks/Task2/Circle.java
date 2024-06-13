import java.util.Scanner;

class Circle {
    
    double radius;

  
    Circle(double radius) {
        this.radius = radius;
    }

    
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    void displayArea() {
        System.out.println("The area of the circle is: " + calculateArea());
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

       
        Circle circle = new Circle(radius);

        
        circle.displayArea();

       
        scanner.close();
    }
}
