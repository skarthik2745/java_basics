// InterfaceDemo.java
// A simple, self-contained example showing how interfaces work in Java.

//////////////////////
// 1) Define Interfaces
//////////////////////

// An interface is a "contract" of WHAT must be done (method signatures),
// not HOW it's done (no method bodies for abstract methods).
interface Vehicle {

    // Constants in interfaces are implicitly public, static, and final.
    // They behave like compile-time constants.
    int MAX_SPEED = 200; // km/h

    // Abstract methods: implicitly public and abstract.
    void start();
    void stop();

    // Default method: has a body in an interface (since Java 8).
    // Classes that implement Vehicle inherit this behavior,
    // but can override it if they want to customize.
    default void honk() {
        System.out.println("Vehicle: Beep!");
    }

    // Static method: belongs to the interface type itself.
    // Call it as Vehicle.printManufacturerGuide(), not via an instance.
    static void printManufacturerGuide() {
        System.out.println("Vehicle Guide: Follow traffic rules and service regularly.");
    }
}

// A second interface to demonstrate multiple interface implementation.
interface Electric {
    // Abstract method
    void charge(int percent);

    // Default method: provides a reasonable default behavior.
    default int estimateRange(int batteryPercent) {
        // Very rough estimate: 1% battery -> 3 km
        return batteryPercent * 3;
    }
}

//////////////////////
// 2) Implement Interfaces
//////////////////////

// A class can implement multiple interfaces (Java doesn't support multiple class inheritance).
class Car implements Vehicle, Electric {
    private final String model;
    private int battery; // 0 to 100

    // Constructor
    Car(String model, int battery) {
        this.model = model;
        this.battery = Math.max(0, Math.min(100, battery));
    }

    // Implement abstract methods from Vehicle
    @Override
    public void start() {
        System.out.println(model + " started.");
    }

    @Override
    public void stop() {
        System.out.println(model + " stopped.");
    }

    // Override the default method from Vehicle to customize behavior
    @Override
    public void honk() {
        System.out.println(model + ": Beep Beep!");
    }

    // Implement abstract method from Electric
    @Override
    public void charge(int percent) {
        battery = Math.min(100, battery + Math.max(0, percent));
        System.out.println(model + " charged to " + battery + "%.");
    }

    // Class-specific helper method (not part of any interface)
    int currentRange() {
        // Reuse default method from Electric (inherited into the class)
        return estimateRange(battery);
    }
}

//////////////////////
// 3) Use the Interfaces
//////////////////////

public class InterfaceDemo {
    public static void main(String[] args) {
        // You cannot instantiate an interface directly:
        // Vehicle v = new Vehicle(); // ❌ Not allowed

        // Create a Car which implements Vehicle and Electric
        Car car = new Car("Neo EV", 40);

        // Upcast to interface references (polymorphism):
        Vehicle v = car;   // Treat car as a Vehicle
        Electric e = car;  // Treat car as an Electric

        // Call Vehicle methods (abstract + overridden default)
        v.start();        // -> Neo EV started.
        v.honk();         // -> Neo EV: Beep Beep!
        v.stop();         // -> Neo EV stopped.

        // Call Electric methods
        e.charge(30);     // -> Neo EV charged to 70%.

        // Use default method from Electric via the interface reference
        int est = e.estimateRange(70);
        System.out.println("Estimated range at 70%: " + est + " km");

        // Call class-specific method (not in interface) via the class reference
        System.out.println("Current range (from battery state): " + car.currentRange() + " km");

        // Access interface constant and static method
        System.out.println("Vehicle MAX_SPEED: " + Vehicle.MAX_SPEED + " km/h");
        Vehicle.printManufacturerGuide();
    }
}

/*
Expected output (will be similar):
Neo EV started.
Neo EV: Beep Beep!
Neo EV stopped.
Neo EV charged to 70%.
Estimated range at 70%: 210 km
Current range (from battery state): 210 km
Vehicle MAX_SPEED: 200 km/h
Vehicle Guide: Follow traffic rules and service regularly.
*/