import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string to analyze:");
        String input = scanner.nextLine();
        
        // Initialize counters
        int vowels = 0;
        int consonants = 0;
        int upper = 0;
        int lower = 0;
        int space = 0;
        int number = 0;
        int symbols = 0;
        
        // Analyze each character in the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check for uppercase letters
            if (Character.isUpperCase(c)) {
                upper++;
            }
            
            // Check for lowercase letters
            if (Character.isLowerCase(c)) {
                lower++;
            }
            
            // Check for spaces
            if (Character.isWhitespace(c)) {
                space++;
            }
            
            // Check for digits
            if (Character.isDigit(c)) {
                number++;
            }
            
            // Check for vowels (both uppercase and lowercase)
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || 
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
            
            // Check for symbols (not letter, digit, or whitespace)
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)) {
                symbols++;
            }
        }
        
        // Calculate consonants (letters that are not vowels)
        consonants = (upper + lower) - vowels;
        
        // Display results
        System.out.println("\n=== STRING ANALYSIS RESULTS ===");
        System.out.println("Original string: " + input);
        System.out.println("Total characters: " + input.length());
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Spaces: " + space);
        System.out.println("Numbers: " + number);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Symbols: " + symbols);
        
        // Verify the count
        int totalCounted = upper + lower + space + number + symbols;
        System.out.println("Total counted characters: " + totalCounted);
        
        scanner.close();
    }
}