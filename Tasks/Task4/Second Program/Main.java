public class Main {
    
    // Base class Animal
    public static class Animal {
        public void sound() {
            System.out.println("Animal sound");
        }
    }

    // Subclass Dog
    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Bark");
        }
    }

    // Subclass Cat
    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
