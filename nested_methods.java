// Example of Nesting Methods in Java
class NestingExample {

    // Method to check if a number is even
    boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method that uses isEven() inside it (nested method call)
    void checkNumber(int num) {
        if (isEven(num)) {   // Calling one method inside another
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }



    public static void main(String[] args) {
        NestingExample obj = new NestingExample();
        
        // Testing the nested method
        obj.checkNumber(10);  
        obj.checkNumber(7);   
    }
}