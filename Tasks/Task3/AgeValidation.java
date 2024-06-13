class InvalidAgeException extends Exception {
    private int age;

    public InvalidAgeException(int age) {
        super("Invalid age: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        try {
           
            int age = getAgeFromUser();

            
            if (age < 0 || age > 120) {
               
                throw new InvalidAgeException(age);
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (InvalidAgeException e) {
            
            System.out.println("Invalid age entered: " + e.getMessage());
        }
    }

    public static int getAgeFromUser() {
        
        return 150;
    }
}
