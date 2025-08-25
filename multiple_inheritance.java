// Example of Multiple Inheritance in Java using Interfaces

// First Interface
interface Animal {
    void eat();  // abstract method
}

// Second Interface
interface Bird {
    void fly();  // abstract method
}

// Class implementing both interfaces
class Bat implements Animal, Bird {
    
    // Implementing method from Animal interface
    public void eat() {
        System.out.println("Bat eats insects.");
    }
    
    // Implementing method from Bird interface
    public void fly() {
        System.out.println("Bat can fly at night.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Creating object of Bat class
        Bat bat = new Bat();
        
        // Calling methods
        bat.eat(); // from Animal interface
        bat.fly(); // from Bird interface
    }
}

/*
OUTPUT:
Bat eats insects.
Bat can fly at night.
*/