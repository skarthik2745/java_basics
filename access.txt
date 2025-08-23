// Parent class demonstrating different access specifiers
class Parent {

    // private method -> accessible only inside Parent
    private void privateMethod() {
        System.out.println("Private method in Parent");
    }

    // default (package-private) method -> accessible inside same package
    void defaultMethod() {
        System.out.println("Default method in Parent");
    }

    // protected method -> accessible in same package + subclasses
    protected void protectedMethod() {
        System.out.println("Protected method in Parent");
    }

    // public method -> accessible everywhere
    public void publicMethod() {
        System.out.println("Public method in Parent");

        // calling private method inside Parent itself (valid)
        privateMethod();
    }
}

// Child class inheriting from Parent
class Child extends Parent {

    // Method in Child to test accessibility
    public void testAccess() {
        // privateMethod(); // ❌ NOT accessible (compile-time error)

        defaultMethod();   // ✅ accessible (same package)
        protectedMethod(); // ✅ accessible (since Child extends Parent)
        publicMethod();    // ✅ accessible (public)
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        // --- Testing from Parent object ---
        // p.privateMethod(); // ❌ NOT accessible outside Parent
        p.defaultMethod();    // ✅ Output: Default method in Parent
        p.protectedMethod();  // ✅ Output: Protected method in Parent
        p.publicMethod();     // ✅ Output: Public method in Parent
                              // ✅ Output: Private method in Parent (called internally)

        System.out.println("----");

        // --- Testing from Child object ---
        c.testAccess();
        // ✅ Output: Default method in Parent
        // ✅ Output: Protected method in Parent
        // ✅ Output: Public method in Parent
        // ✅ Output: Private method in Parent (because publicMethod calls it)
    }
}