// Example program for Method Overloading and Method Overriding in Java

// Parent class
class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading: same method name but different parameters
    void info(String name) {
        System.out.println("Animal name: " + name);
    }

    void info(String name, int age) { // Overloaded method
        System.out.println("Animal name: " + name + ", Age: " + age);
    }
}

// Child class
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    // Additional method (not overriding, just separate)
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// Main class
public class OverloadOverrideExample {
    public static void main(String[] args) {
        
        // ----- Method Overloading -----
        Animal a = new Animal();
        a.info("Tiger");             // Calls info(String)
        a.info("Elephant", 10);      // Calls info(String, int)

        // ----- Method Overriding -----
        Animal obj = new Dog();  // Parent reference, Child object
        obj.sound();             // Calls Dog's sound() → Overridden method

        Dog d = new Dog();
        d.fetch();               // Calls child-specific method
        d.sound();
    }
}