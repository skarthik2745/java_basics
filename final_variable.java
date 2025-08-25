// Example program for final variables in Java
class Test {
    final int MIN = 1;       // final variable initialized directly
    final int NORMAL;        // blank final variable (initialized in constructor)
    final int MAX;           // blank final variable (initialized in constructor)

    // Constructor
    Test(int normal) {
        NORMAL = normal;     // assigning value to final variable
        MAX = 100;           // assigning value to final variable
    }

    // Method to display values
    void display() {
        System.out.println("MIN    : " + MIN);
        System.out.println("NORMAL : " + NORMAL);
        System.out.println("MAX    : " + MAX);
    }
}

// Main class
public class finalTest {
    public static void main(String args[]) {
        // Creating object of Test class and passing value for NORMAL
        Test obj = new Test(50);

        // Calling display method
        obj.display();
    }
}