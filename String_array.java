public class StringArrayExample {
    public static void main(String[] args) {
        // Declare and define array of 10 strings
        String[] names = {
            "Apple", "Banana", "Cherry", "Mango", "Orange",
            "Grapes", "Pineapple", "Papaya", "Strawberry", "Watermelon"
        };

        // Print array elements
        System.out.println("Array of Strings:");
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            
        }
        
        for(String t:names){
            System.out.println(t);
        }
    }
}
