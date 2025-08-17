// Example: Demonstrating all types of constructors + Constructor Overloading
class Student {
    String name;
    int age;
    String course;

    // 1. Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
        System.out.println("Default Constructor called");
    }

    // 2. Parameterized Constructor (Constructor Overloading)
    Student(String n) {   // Only name
        name = n;
        age = 0;
        course = "Not Assigned";
        System.out.println("Parameterized Constructor (1 arg) called");
    }

    Student(String n, int a) {   // Name + Age
        name = n;
        age = a;
        course = "Not Assigned";
        System.out.println("Parameterized Constructor (2 args) called");
    }

    Student(String n, int a, String c) {   // Name + Age + Course
        name = n;
        age = a;
        course = c;
        System.out.println("Parameterized Constructor (3 args) called");
    }

    // 3. Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
        course = s.course;
        System.out.println("Copy Constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class Main{
    public static void main(String[] args) {
        // Default Constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized Constructors (Overloading)
        Student s2 = new Student("Karthik");
        s2.display();

        Student s3 = new Student("Anitha", 20);
        s3.display();

        Student s4 = new Student("Ravi", 21, "ECE");
        s4.display();

        // Copy Constructor
        Student s5 = new Student(s4);
        s5.display();
    }
}
