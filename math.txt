public class Main {
    public static void main(String[] args) {
        System.out.println("Java Math Functions Demonstration");
        System.out.println("=================================");
        System.out.println();
        
        // Basic numerical constants
        System.out.println("1. MATHEMATICAL CONSTANTS:");
        System.out.println("   Math.PI: " + Math.PI);
        System.out.println("   Math.E: " + Math.E);
        System.out.println();
        
        // Basic arithmetic operations
        System.out.println("2. BASIC ARITHMETIC OPERATIONS:");
        double a = 25.0;
        double b = 7.0;
        System.out.println("   a = " + a + ", b = " + b);
        System.out.println("   Math.max(a, b): " + Math.max(a, b));
        System.out.println("   Math.min(a, b): " + Math.min(a, b));
        System.out.println("   Math.abs(-10.5): " + Math.abs(-10.5));
        System.out.println();
        
        // Exponential and logarithmic functions
        System.out.println("3. EXPONENTIAL AND LOGARITHMIC FUNCTIONS:");
        System.out.println("   Math.exp(2): " + Math.exp(2)); // e^2
        System.out.println("   Math.log(10): " + Math.log(10)); // Natural log (base e)
        System.out.println("   Math.log10(100): " + Math.log10(100)); // Base 10 log
        System.out.println("   Math.pow(2, 3): " + Math.pow(2, 3)); // 2^3
        System.out.println("   Math.sqrt(25): " + Math.sqrt(25)); // Square root
        System.out.println("   Math.cbrt(27): " + Math.cbrt(27)); // Cube root
        System.out.println();
        
        // Trigonometric functions
        System.out.println("4. TRIGONOMETRIC FUNCTIONS:");
        double angleInRadians = Math.PI / 4; // 45 degrees
        System.out.println("   Angle: π/4 radians (45 degrees)");
        System.out.println("   Math.sin(π/4): " + Math.sin(angleInRadians));
        System.out.println("   Math.cos(π/4): " + Math.cos(angleInRadians));
        System.out.println("   Math.tan(π/4): " + Math.tan(angleInRadians));
        System.out.println();
        
        // Inverse trigonometric functions
        System.out.println("5. INVERSE TRIGONOMETRIC FUNCTIONS:");
        double value = 0.5;
        System.out.println("   Value: " + value);
        System.out.println("   Math.asin(0.5): " + Math.asin(value) + " radians");
        System.out.println("   Math.acos(0.5): " + Math.acos(value) + " radians");
        System.out.println("   Math.atan(0.5): " + Math.atan(value) + " radians");
        System.out.println("   Math.atan2(1, 1): " + Math.atan2(1, 1) + " radians");
        System.out.println();
        
        // Hyperbolic functions
        System.out.println("6. HYPERBOLIC FUNCTIONS:");
        System.out.println("   Math.sinh(1): " + Math.sinh(1));
        System.out.println("   Math.cosh(1): " + Math.cosh(1));
        System.out.println("   Math.tanh(1): " + Math.tanh(1));
        System.out.println();
        
        // Rounding functions
        System.out.println("7. ROUNDING FUNCTIONS:");
        double num1 = 12.49;
        double num2 = 12.50;
        double num3 = 12.51;
        System.out.println("   Numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("   Math.round(12.49): " + Math.round(num1));
        System.out.println("   Math.round(12.50): " + Math.round(num2));
        System.out.println("   Math.round(12.51): " + Math.round(num3));
        System.out.println("   Math.ceil(12.1): " + Math.ceil(12.1)); // Round up
        System.out.println("   Math.floor(12.9): " + Math.floor(12.9)); // Round down
        System.out.println("   Math.rint(12.5): " + Math.rint(12.8)); // Returns closest integer
        System.out.println();
        
        // Angle conversion functions
        System.out.println("8. ANGLE CONVERSION FUNCTIONS:");
        double degrees = 180.0;
        double radians = Math.PI;
        System.out.println("   Math.toRadians(180): " + Math.toRadians(degrees));
        System.out.println("   Math.toDegrees(π): " + Math.toDegrees(radians));
        System.out.println();
        
        // Random number generation
        System.out.println("9. RANDOM NUMBER GENERATION:");
        System.out.println("   Math.random(): " + Math.random()); // Between 0.0 and 1.0
        System.out.println("   Random integer between 1 and 10: " + 
                          (int)(Math.random() * 10 + 1));
        System.out.println();
        
        // Sign-related functions
        System.out.println("10. SIGN-RELATED FUNCTIONS:");
        System.out.println("   Math.signum(10.5): " + Math.signum(10.5));
        System.out.println("   Math.signum(-10.5): " + Math.signum(-10.5));
        System.out.println("   Math.signum(0): " + Math.signum(0));
        System.out.println();
        
        // Copy sign function
        System.out.println("11. COPY SIGN FUNCTION:");
        System.out.println("   Math.copySign(10.5, -1): " + Math.copySign(10.5, -1));
        System.out.println("   Math.copySign(-10.5, 1): " + Math.copySign(-10.5, 1));
        System.out.println();
        
        
        
    }
}