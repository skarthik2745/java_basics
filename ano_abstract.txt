// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Normal method
    void display() {
        System.out.println("This is a shape.");
    }
}



public class AnonymousAbstractExample2 {
    public static void main(String[] args) {

        // Anonymous inner class implementing abstract class
        Shape circle = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a Circle ⭕");
            }
        };

        Shape square = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a Square ◼");
            }
        };

        // Calling methods
        circle.display();  // calling normal method from abstract class
        circle.draw();     // calling overridden method

        square.display();
        square.draw();
    }
}