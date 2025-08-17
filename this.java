// Example: Using 'this' keyword in Classes & Objects
class Student {
    String name;
    int age;

    // Constructor with parameters having same name as instance variables
    Student(String name, int age) {
        // 'this' refers to the current object's variables
        this.name = name;
        this.age = age;
    }

    // Method using 'this' to call another method
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        // Calling another method using 'this'
        this.showMessage();
    }

    void showMessage() {
        System.out.println("This is inside showMessage() method.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Student s1 = new Student("Karthik", 21);
        Student s2 = new Student("Anita", 20);

        // Displaying details
        s1.display();
        s2.display();
    }
}
