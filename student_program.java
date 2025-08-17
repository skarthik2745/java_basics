class Student {
    String name;
    int rollNumber;
    char grade;    
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 'A');
        Student student2 = new Student("Bob", 102, 'B');
        Student student3 = new Student("Charlie", 103, 'A');      
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}