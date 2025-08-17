// Example to understand Classes and Objects in Java
class Car {
    // Properties (also called instance variables or fields)
    String brand;
    String model;
    int year;

    // Constructor (special method to initialize objects)
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to start the car
    void start() {
        System.out.println(brand + " " + model + " is starting...");
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Car: " + brand + " | Model: " + model + " | Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Tesla", "Model 3", 2023);

        // Call methods using objects
        car1.start();
        car1.displayInfo();

        System.out.println("________________________________"); // Just for spacing

        car2.start();
        car2.displayInfo();
    }
}
