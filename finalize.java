// Example: Garbage Collection and finalize() method in Java

class Demo {
    String objName;

    // Constructor
    Demo(String name) {
        this.objName = name;
    }

    // finalize() method is called by Garbage Collector before destroying the object
    @Override
    protected void finalize() {
        System.out.println("Garbage Collector is destroying object: " + objName);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Demo d1 = new Demo("Object1");
        Demo d2 = new Demo("Object2");

        // Printing messages
        System.out.println("Objects created: " + d1.objName + ", " + d2.objName);

        // Making objects eligible for Garbage Collection
        d1 = null;   // Now Object1 has no reference
        d2 = null;   // Now Object2 has no reference

        // Suggesting JVM to run Garbage Collector
        System.gc();

        System.out.println("End of main method...");
    }
}
