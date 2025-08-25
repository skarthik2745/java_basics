// Final class
final class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}

// Trying to extend a final class ❌ Not Allowed
// class AdvancedCalculator extends Calculator { 
//     // Error: Cannot inherit from final class
// }

public class FinalClassDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);       // Calls method in final class
        calc.multiply(5, 4);    // Calls method in final class
    }
}