// Parent class
class Vehicle {
    // final method cannot be overridden in child classes
    final void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Child class
class Car extends Vehicle {
    // ❌ Cannot override start() because it's final
    // void start() { 
    //     System.out.println("Car is starting...");  // Error
    // }

    // Allowed: we can still override stop()
    @Override
    void stop() {
        System.out.println("Car is stopping...");
    }
}

// Main class
public class FinalMethodDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();  // Calls final method from Vehicle class
        myCar.stop();   // Calls overridden method in Car class
    }
}