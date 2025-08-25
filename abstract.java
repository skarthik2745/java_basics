// Example program for Abstract Class in Java

// Abstract class: cannot be instantiated directly
abstract class Animal {

    // Abstract method (no body) → must be implemented by subclasses
    abstract void sound();

    // Normal method (can have body inside abstract class)
    void sleep() {
        System.out.println("This animal is sleeping...");
    }
}

// Child class Dog inheriting from Animal
class Dog extends Animal {

    // Providing implementation for abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class Cat inheriting from Animal
class Cat extends Animal {

    // Providing implementation for abstract method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        
        // We cannot create object of abstract class directly:
        // Animal a = new Animal();  // ❌ Error

        // Creating objects of subclasses
        Animal dog = new Dog(); 
        Cat cat = new Cat();

        // Calling abstract method (implemented in child classes)
        dog.sound();  // Dog barks
        cat.sound();  // Cat meows

        // Calling normal method from abstract class
        dog.sleep();
        cat.sleep();
    }
}