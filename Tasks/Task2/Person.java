import java.util.Scanner;

class Person {
   
    String name;
    int age;

  
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    void greet() {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

       
        Person person = new Person(name, age);

       
        person.greet();

        
        scanner.close();
    }
}
