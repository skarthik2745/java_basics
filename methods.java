// Example: Rectangle class with attributes and methods (no parameters)
class Rectangle {
    // Attributes
    int length;
    int width;

    // Method to set values (no parameters, just fixed for example)
    void setValues(int l,int w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }

    // Method to calculate perimeter
    void perimeter() {
        int result = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Rectangle class
        Rectangle rect = new Rectangle();

        // Set values
        rect.setValues(20,30);

        // Call methods
        rect.area();
        rect.perimeter();
    }
}
